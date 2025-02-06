/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.Scanner;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class EquationSolver {

    private double a;
    private double b;
    private double c;

    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public EquationSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double solveLinearEquation() {
        if (a == 0) {
            throw new ArithmeticException("No solution for a = 0.");
        }
        return -b / a;
    }

    public double[] solveQuadraticEquation() {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            throw new ArithmeticException("No real solutions.");
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{x1, x2};
    }

    public boolean isOdd(double number) {
        return number % 2 != 0;
    }

    public boolean isEven(double number) {
        return number % 2 == 0;
    }

    public boolean isPerfectSquare(double number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public void checkNumber(double[] numbers) {
        System.out.print("Odd numbers: ");
        for (double num : numbers) {
            if (isOdd(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (double num : numbers) {
            if (isEven(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Perfect squares: ");
        for (double num : numbers) {
            if (isPerfectSquare(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

class Display {

    private final Scanner scanner;

    public Display() {
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return checkInputIntLimit(1, 3);
    }

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public double checkInputDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Must be a double number");
                System.out.print("Enter again: ");
            }
        }
    }

    public void solveLinearEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();

        EquationSolver solver = new EquationSolver(a, b);
        try {
            double solution = solver.solveLinearEquation();
            System.out.println("Solution: x = " + solution);
            solver.checkNumber(new double[]{a, b, solution});
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public void solveQuadraticEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        System.out.print("Enter C: ");
        double c = checkInputDouble();

        EquationSolver solver = new EquationSolver(a, b, c);
        try {
            double[] solutions = solver.solveQuadraticEquation();
            System.out.println("Solutions: x1 = " + solutions[0] + ", x2 = " + solutions[1]);
            solver.checkNumber(new double[]{a, b, c, solutions[0], solutions[1]});
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
