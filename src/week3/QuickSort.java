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
import java.util.Arrays;

public class QuickSort {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        Random random=new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100)+1;
        }
        System.out.println("Unsorted arrray: "+Arrays.toString(array));
        quickSort(array, 0, length - 1);
        System.out.print("Sorted array: "+Arrays.toString(array));
     
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
}
