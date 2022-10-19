//Roy Afaryan
//CS3010
//Project 1
//October 10, 2022

import java.util.*;
import java.lang.Math;
import java.io.*;

public class Project_1{

    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of linear equations: ");
        int numberOfEquations = scanner.nextInt();
        int numberOfCoefficients = numberOfEquations + 1;
        double[][] coefficientMatrix = new double[numberOfEquations][numberOfCoefficients];

        System.out.println("Would you like to enter a file? (y or n): ");
        String answer = scanner.next();
        if(answer.compareTo("y") == 0){
            System.out.println("Please enter file name: ");
            String filename = scanner.next();
            try{
                fileReader(filename, coefficientMatrix);

            } catch (FileNotFoundException e){
                System.err.println("File error(ReadFile:Main): " + e.getMessage());
                System.exit(1);
            }
        }
        else{
    
            System.out.println("Please enter coefficients (including b values): ");

            for(int i = 0; i < numberOfEquations; i++){     //loop to enter coefficients
                for(int j = 0; j < numberOfCoefficients; j++){
                    coefficientMatrix[i][j] = scanner.nextInt();
                }
            }
            
        }
        GaussianElimination(coefficientMatrix);
    }

    public static void GaussianElimination(double[][] matrix){

        matrix = forwardElimination(matrix);
        double[] solution = backSubstitution(matrix);

        for(int i = 0; i < solution.length; i++){
            int j = i + 1;
            System.out.println("x" + j + " = " + solution[i]);
        }

    }

    public static void swap(double[][] matrix, int i, int j){

        double[] temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;

    }

    public static double[][] forwardElimination(double[][] matrix){

        double[] maxValues = new double [matrix[1].length - 1];
        int i_max = 0;

        for(int k = 0; k < matrix.length - 1; k++){
            double max = maxValues[k];
            for(int i = k; i < matrix.length - 1; i++){
                for(int j = k; j < matrix[0].length - 1; j++){
                    if(Math.abs(matrix[i][j]) > Math.abs(maxValues[i])){
                        maxValues[i] = matrix[i][j];
                    }
                }
                double firstTerm = Math.abs(matrix[i][k]);
                if(firstTerm != 0){
                    maxValues[i] = maxValues[i]/firstTerm;
                }
            }
        
        
            for(int i = k; i < matrix.length - 1; i++){
                if(maxValues[i] > max){
                    max = maxValues[i];
                    i_max = i;
                }
            }
        System.out.println("i_max = " + i_max);
        System.out.println("max = " + max);
        System.out.println("before swap");
        printMatrix(matrix);
        
        swap(matrix, k, i_max);
        System.out.println("after swap");
        printMatrix(matrix);

        for(int j = k + 1; j < matrix.length; j++) {
            double pivotFactor = matrix[j][k] / matrix [k][k];
            for(int q = k; q < matrix[0].length; q++){
                matrix[j][q] -= pivotFactor * matrix[k][q];
            }
            
        }
        System.out.println("after pivot");
        printMatrix(matrix);
 
    }
    
    return matrix;
}

    public static double[] backSubstitution(double[][] matrix){

        double[] solution = new double[matrix[0].length - 1];
	    for (int i = matrix.length - 1; i >= 0; i--){
		    for(int j = matrix[0].length - 2; j >= 0; j--){
                if(i == j){
                    solution[i] = matrix[i][matrix[0].length - 1] / matrix[i][j];
                    matrix[i][matrix[0].length - 1] /= matrix[i][j];
                    matrix[i][j] = 1;   
                }
                else{
                    matrix[i][matrix[0].length-1] -= solution[j] * matrix[i][j];
                    matrix[i][j] = 0;
                }
		    }
	    }
        
	    return solution;

    }

    public static void printMatrix(double[][] matrix){
        System.out.print("\nCoefficient matrix: \n");
        for(double[]x:matrix){                  
            for(double y:x){
            System.out.print(y+"      ");
            }
            System.out.println();
        }
    }

    public static double[][] fileReader(String filename, double[][] coefficientMatrix) throws FileNotFoundException{
        
        

        try(Scanner inFile = new Scanner(new File("gaussarraytest.txt"))){
            while(inFile.hasNextLine()){
                for(int i = 0; i < coefficientMatrix.length; i++){
                    String[] line = inFile.nextLine().trim().split(" ");
                    for(int j = 0; j < line.length; j++){
                        coefficientMatrix[i][j] = Double.parseDouble(line[j]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        printMatrix(coefficientMatrix);
        return coefficientMatrix;
        
    }

}