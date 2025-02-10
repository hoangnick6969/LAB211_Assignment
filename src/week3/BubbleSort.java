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
import java.util.Random;

public class BubbleSort {

    private int[] array;

    public BubbleSort(int n) {
        this.array = new int[n];
    }

    public void addValue() {
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
//            this.array[i] = random.nextInt(this.array.length);
              this.array[i]=random.nextInt(100)+1;
        }
    }

    public void display() {
//        for (int i = 0; i < this.array.length; i++) {
//            System.out.println("The value of the " + (i + 1) + "th element in the array is: " + this.array[i]);
//}
  System.out.println(Arrays.toString(this.array)); 
        
    }

    public void sortValue() {
        for (int i = 0; i < this.array.length - 1; i++) {
            for (int j = 0; j < this.array.length - 1 - i; j++) {  
                if (this.array[j] > this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }

    static void run() {
       
        BubbleSort sorter = new BubbleSort(10);
        sorter.addValue();  
        System.out.println("Unsorted Array: ");
        sorter.display();   

        sorter.sortValue(); 

        System.out.println("\nSorted Array: ");
        sorter.display();  
    }
}
