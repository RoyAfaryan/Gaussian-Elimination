# Gaussian Elimination Solver

This program is a Java implementation of a Gaussian elimination solver. It solves a system of linear equations by performing forward elimination and back substitution using the Gaussian elimination algorithm.

## Usage

1. Run the program: `java Project_1`

2. Enter the number of linear equations.

3. Provide coefficients:
   - **Manual Input**: Enter coefficients (including 'b' values) for each equation.
   - **File Input**: Enter 'y' and provide the filename (with correct format) containing coefficients.

4. View the solution: The program will display the values of each variable 'x' in the system.

### Example Input Format

Manual Input:
a11 a12 ... a1n b1
a21 a22 ... a2n b2
. . . .
. . . .
. . . .
an1 an2 ... ann bn


File Input:
a11 a12 ... a1n b1
a21 a22 ... a2n b2
. . . .
. . . .
. . . .
an1 an2 ... ann bn


**Note:** The number of equations specified in the program should match the number of equations in the input.

## Additional Information

- The program uses Gaussian elimination, a common numerical method for solving systems of linear equations.
- It performs forward elimination to convert the coefficient matrix into row-echelon form and then uses back substitution to obtain the solution.

For any questions or issues, please contact Roy Afaryan (email: roy.afaryan@example.com).
When pasting the above Markdown code, ensure that you adjust the formatting and any other requirements based on your specific repository.
