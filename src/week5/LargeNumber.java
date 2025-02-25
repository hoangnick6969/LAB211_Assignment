/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author PC
 */

import java.math.BigInteger;
import java.util.Scanner;


public class LargeNumber {
private static Scanner in =new Scanner(System.in);
    public static String checkInput() {
        String pattern = "\\d+";
        while (true) {
            System.out.print("Enter a number: ");
            String input = in.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println("Not empty!!!");
                continue;
            }
            if (!input.matches(pattern)) {
                System.err.println("Only number!!!");
                continue;
            }
            return input;
        }
    }

    public static void main(String[] args) {
        String numOne = checkInput();
        String numTwo = checkInput();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println("Result: ");
        System.out.println(bigNumOne.multiply(bigNumTwo));
        System.out.println(bigNumOne.add(bigNumTwo));
        in.close();
    }
}