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

public class Test {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculator and BMI");
            System.out.println("2. Shapes (Rectangle, Circle, Triangle)");
            System.out.println("3. Matrix Operations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = checkInputIntLimit(1, 4);

            switch (choice) {
                case 1:
                    new CalculatorProgram().run();
                    break;
                case 2:
                    new CalculatorShape().run();
                    break;
                case 3:
                    new Matrix().run();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
            }
        }
    }

    private static int checkInputIntLimit(int min, int max) {
    while (true) {
        try {
            String input = in.nextLine().trim(); // Đọc chuỗi và loại bỏ khoảng trắng đầu/cuối
            int result = Integer.parseInt(input); // Chuyển thành số nguyên
            
            if (result < min || result > max) { 
                System.err.println("Please enter a number between " + min + " and " + max + ".");
                continue; // Quay lại vòng lặp để nhập lại
            }
            return result;
        } catch (NumberFormatException ex) { 
            System.err.println("Invalid input! Please enter a valid integer.");
            }
        }
    }
}

