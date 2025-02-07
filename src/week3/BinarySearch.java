/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author PC
 */
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int length = scanner.nextInt();
        System.out.print("Enter search value: ");
        int search = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        bubbleSort(array);
        int result = binarySearch(array, search, 0, length - 1);
        System.out.println("Found " + search + " at index: " + result);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static int binarySearch(int[] array, int value, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) return middle;
            else if (array[middle] > value) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }
}
