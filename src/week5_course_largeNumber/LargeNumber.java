/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_course_largeNumber;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class LargeNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static String addLargeNumbers(String s1, String s2) {
        int maxLength = Math.max(s1.length(), s2.length());
        int[] result = new int[maxLength + 1];
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int size = 0;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? (s1.charAt(i) - '0') : 0;
            int digit2 = (j >= 0) ? (s2.charAt(j) - '0') : 0;
            
            int sum = digit1 + digit2 + carry;
            result[size] = sum % 10;
            carry = sum / 10;
            
            size++;
            i--;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = size - 1; k >= 0; k--) {
            sb.append(result[k]);
        }
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }

    public static String multiplyLargeNumbers(String s1, String s2) {
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int[] result = new int[s1.length() + s2.length()];
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                int digit1 = s1.charAt(i) - '0';
                int digit2 = s2.charAt(j) - '0';
                
                int pos = (s1.length() - 1 - i) + (s2.length() - 1 - j);
                int temp = digit1 * digit2 + result[pos];
                
                result[pos] = temp % 10;
                result[pos + 1] += temp / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = result.length - 1; k >= 0; k--) {
            sb.append(result[k]);
        }
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }

    private static String getValidNumberInput(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        
        while (!input.matches("\\d+")) {
            System.out.println("Invalid input! Please enter a number (digits only).");
            System.out.print(prompt);
            input = scanner.nextLine().trim();
        }
        
        return input;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Large Number Operations ===");
            System.out.println("1. Add two large numbers");
            System.out.println("2. Multiply two large numbers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    System.out.println("\n--- Add Large Numbers ---");
                    String num1Add = getValidNumberInput("Enter first number: ");
                    String num2Add = getValidNumberInput("Enter second number: ");
                    String sum = addLargeNumbers(num1Add, num2Add);
                    System.out.println(num1Add + " + " + num2Add + " = " + sum);
                    break;

                case "2":
                    System.out.println("\n--- Multiply Large Numbers ---");
                    String num1Mul = getValidNumberInput("Enter first number: ");
                    String num2Mul = getValidNumberInput("Enter second number: ");
                    String product = multiplyLargeNumbers(num1Mul, num2Mul);
                    System.out.println(num1Mul + " * " + num2Mul + " = " + product);
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-3.");
            }
            System.out.println();
        }
    }
}