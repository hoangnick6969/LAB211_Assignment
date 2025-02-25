/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */
import java.util.Random;

public class LinearSearch {
    private int[] array;

    public LinearSearch(int size) {
        array = new int[size];
        generateRandomArray();
    }
    
    private void generateRandomArray() {
        Random random = new Random();
        System.out.println("Generate array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.println(array[i]+"");
        }
        System.out.println();
    }

    public int search(int target) {
        //
        
        for(int i=0; i< array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        
        return -1;
    }
    
    public void displayArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void displaySearch(int target) {
        displayArray();
        int index = search(target);
        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found.");
        }
    }   
}