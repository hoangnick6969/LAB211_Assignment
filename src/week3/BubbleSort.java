/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author PC
 */
import java.util.Scanner;

public class BubbleSort {
    private static final Scanner in = new Scanner(System.in);

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    private static int inputSizeOfArray() {
        System.out.print("Enter number of array: ");
        return checkInputInt();
    }

    private static int[] inputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = checkInputInt();
        }
        return a;
    }

    private static void sortArrayByBubbleSort(int[] a) {
        System.out.print("Unsorted array: ");
        displayArray(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    private static void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void run() {
        int n = inputSizeOfArray();
        int[] a = inputValueOfArray(n);
        sortArrayByBubbleSort(a);
        System.out.print("Sorted array: ");
        displayArray(a);
    }
}
