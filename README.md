Gaussian Elimination Solver - README
This program is a Java implementation of a Gaussian elimination solver. It solves a system of linear equations by performing forward elimination and back substitution using the Gaussian elimination algorithm.

Usage Instructions
To use the Gaussian elimination solver program, follow these step-by-step instructions:

Run the Program: Execute the compiled Java code using the following command:

Copy code
java Project_1
Enter the Number of Linear Equations: Upon running the program, you will be prompted to enter the number of linear equations in the system.

Provide Input (Coefficients): Depending on your preference, you can either manually enter the coefficients or read them from a file.

Manual Input: If you choose to manually enter the coefficients, follow the prompts to provide the coefficients (including the constants 'b' values) for each equation.

File Input: If you choose to read the coefficients from a file, enter 'y' when prompted and then provide the filename (including the extension). Make sure the file contains the coefficients in the correct format.

View the Solution: Once the coefficients are entered, the program will perform Gaussian elimination to solve the system of linear equations. The solution will be displayed, showing the values of each variable 'x' in the system.

Example Input Format
If you choose manual input, you should provide the coefficients (including 'b' values) in the following format:

css
Copy code
Please enter coefficients (including b values):
a11 a12 ... a1n b1
a21 a22 ... a2n b2
.   .        .    .
.   .        .    .
.   .        .    .
an1 an2 ... ann bn
Where:

a11, a12, ..., a1n are the coefficients of the first equation.
a21, a22, ..., a2n are the coefficients of the second equation.
Similarly, an1, an2, ..., ann are the coefficients of the nth equation.
b1, b2, ..., bn are the constants on the right-hand side of each equation.
Example File Input Format
If you choose to read the coefficients from a file, ensure that the file follows the format shown below:

Copy code
a11 a12 ... a1n b1
a21 a22 ... a2n b2
.   .        .    .
.   .        .    .
.   .        .    .
an1 an2 ... ann bn
Where each line represents an equation, and the coefficients and constant 'b' values are separated by spaces.

Note: The number of equations specified in the program should match the number of equations in the input (manual or file).

Additional Information
The program uses Gaussian elimination, a common numerical method for solving systems of linear equations.
It performs forward elimination to convert the coefficient matrix into row-echelon form and then uses back substitution to obtain the solution.
The program provides the values of each variable 'x' in the system as the solution.
For any questions or issues, please contact Roy Afaryan (email: roy.afaryan@example.com).
