/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import java.util.Scanner;


public class CalculatorProgram {
    private final Scanner in = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = checkInputIntLimit(1, 3);

            switch (choice) {
                case 1:
                    normalCalculator();
                    break;
                case 2:
                    BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void normalCalculator() {
        System.out.print("Enter first number: ");
        double num1 = checkInputDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = in.nextLine().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = checkInputDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);
    }

    private void BMICalculator() {
        System.out.print("Enter weight (kg): ");
        double weight = checkInputDouble();
        System.out.print("Enter height (m): ");
        double height = checkInputDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    private double checkInputDouble() {
        while (true) {
            try {
                return Double.parseDouble(in.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Please enter a valid number.");
            }
        }
    }

    private int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                    }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Please enter a number between " + min + " and " + max + ".");
            }
        }
    }
}