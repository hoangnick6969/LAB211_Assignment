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
        int decimalValue = Integer.parseInt(inputValue, inputBase);
        return switch (outputBase) {
            case 2 -> Integer.toBinaryString(decimalValue);
            case 10 -> String.valueOf(decimalValue);
            case 16 -> Integer.toHexString(decimalValue).toUpperCase();
            default -> "Invalid output base";
        };
    }

    public void displayConverter(Scanner scanner) {
        System.out.print("Enter input value: ");
        String inputValue = scanner.nextLine();

        System.out.print("Enter input base (2, 10, 16): ");
        int inputBase = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter output base (2, 10, 16): ");
        int outputBase = scanner.nextInt();

        BaseConverter baseConverter = new BaseConverter(inputValue, inputBase, outputBase);
        System.out.println("Converted value: " + baseConverter.convert());
    }

    void displayConverter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
