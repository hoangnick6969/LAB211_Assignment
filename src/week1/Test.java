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

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Word Counter");
            System.out.println("2. Linear Search");
            System.out.println("3. Base Converter");
            System.out.println("4. Equation Solver");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a sentence: ");
                    String input = scanner.nextLine();
                    WordCounter wordCounter = new WordCounter(input);
                    wordCounter.displayCounter();
                }
                case 2 -> {
                    System.out.print("Enter array size: ");
                    int size = scanner.nextInt();
                    LinearSearch linearSearch = new LinearSearch(size);
                    System.out.print("Enter number to search: ");
                    int target = scanner.nextInt();
                    linearSearch.displaySearch(target);
                }
                case 3 -> {
                    System.out.print("Enter input value: ");
                    String inputValue = scanner.nextLine();
                    System.out.print("Enter input base (2, 10, 16): ");
                    int inputBase = scanner.nextInt();
                    System.out.print("Enter output base (2, 10, 16): ");
                    int outputBase = scanner.nextInt();
                    BaseConverter baseConverter = new BaseConverter(inputValue, inputBase, outputBase);
                    baseConverter.displayConverter();
                }
               case 4 -> {
                    Display display = new Display();
                        
                    while (true) {
                        int option = display.menu();
                        switch (option) {
                            case 1 -> display.solveLinearEquation();
                            case 2 -> display.solveQuadraticEquation();
                            case 3 -> {
                                System.out.println("Exiting...");
                                return;
                            }
                            default -> System.out.println("Invalid choice. Please try again!");
                        }
                    }
                }
                
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please choose again!");
            }
        }
    }
}

