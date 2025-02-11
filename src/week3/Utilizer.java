/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author PC
 */
import java.util.Scanner;
import java.util.Stack;
public class Utilizer {
    private static final Scanner scanner = new Scanner(System.in);

    private static int checkInputInt() {
        while (true) {
            try {
                int input=Integer.parseInt(scanner.nextLine().trim());
                if (input<2) throw new IllegalArgumentException("Error");
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer:");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Binary Search");
        System.out.println("4. Stack Operations");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = checkInputInt();
            switch (choice) {
                case 1:
                    BubbleSort.run();
                    break;
                case 2:
                    QuickSort.run();
                    break;
                case 3:
                    BinarySearch.run();
                    break;
                case 4:
                    MyStack.run();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
