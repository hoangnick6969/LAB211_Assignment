/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Matrix {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = checkInputIntLimit(1, 4);

            if (choice == 4) {
                System.out.println("Exiting...");
                return;
            }

            System.out.println("Input Matrix 1:");
            int[][] matrix1 = inputMatrix();
            System.out.println("Input Matrix 2:");
            int[][] matrix2 = inputMatrix();

            switch (choice) {
                case 1:
                    performAddition(matrix1, matrix2);
                    break;
                case 2:
                    performSubtraction(matrix1, matrix2);
                    break;
                case 3:
                    performMultiplication(matrix1, matrix2);
                    break;
            }
        }
    }

    private int[][] inputMatrix() {
        System.out.print("Enter number of rows: ");
        int rows = checkInputInt();
        System.out.print("Enter number of columns: ");
        int cols = checkInputInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = checkInputInt();
            }
        }
        return matrix;
    }

    private void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print("[" + value + "] ");
            }
            System.out.println();
        }
    }

    private void performAddition(int[][] matrix1, int[][] matrix2) {
        if (!isSameDimension(matrix1, matrix2)) {
            System.err.println("Matrices must have the same dimensions for addition.");
            return;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Result of Addition:");
        displayMatrix(result);
    }

    private void performSubtraction(int[][] matrix1, int[][] matrix2) {
        if (!isSameDimension(matrix1, matrix2)) {
            System.err.println("Matrices must have the same dimensions for subtraction.");
            return;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Result of Subtraction:");
        displayMatrix(result);
    }

    private void performMultiplication(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.err.println("Number of columns in Matrix 1 must equal number of rows in Matrix 2.");
            return;
        }

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int commonDimension = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDimension; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Result of Multiplication:");
        displayMatrix(result);
    }

    private int checkInputInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Invalid input. Please enter an integer:");
            }
        }
    }

    private int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Please enter a number between " + min + " and " + max + ".");
            }
        }
    }

    private boolean isSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }
}
        