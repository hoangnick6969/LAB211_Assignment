/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class BaseConverter {
    private String inputValue;
    private int inputBase;
    private int outputBase;

    public BaseConverter(String inputValue, int inputBase, int outputBase) {
        this.inputValue = inputValue;
        this.inputBase = inputBase;
        this.outputBase = outputBase;
    }

    public String convert() {
        try {
            long decimalValue = Long.parseLong(inputValue, inputBase);
            return switch (outputBase) {
                case 2 -> Long.toBinaryString(decimalValue);
                case 10 -> String.valueOf(decimalValue);
                case 16 -> Long.toHexString(decimalValue).toUpperCase();
                default -> "Invalid output base";
            };
        } catch (NumberFormatException e) {
            return "Invalid input value for base " + inputBase;
        }
    }

    public void displayConverter(Scanner scanner) {
        System.out.print("Enter input value: ");
        this.inputValue = scanner.nextLine().toUpperCase();

        System.out.print("Enter input base (2, 10, 16): ");
        this.inputBase = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter output base (2, 10, 16): ");
        this.outputBase = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Converted value: " + this.convert());
    }

    void displayConverter() {
        System.out.println("No input provided. Please use the method with Scanner parameter.");
    }
}
