/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Array {
    private int[] array;
    
    public Array(int n){
        this.array = new int[n];
    }
    public void addValue()
    {
       Random random = new Random();
       for(int i=0;i<this.array.length;i++)
       {
           this.array[i] = random.nextInt(this.array.length);
       }
    }
    public void Display()
    {
        for(int i=0;i<this.array.length;i++)
       {
           System.out.println( "the value of the " + (i+1) +"element in array is :" + this.array[i]);
       }
    }
    public void sortValue()
    {
        for(int i=0;i<this.array.length-1;i++)
            
        {
            for(int j=0; j<this.array.length-i;j++)
            {
                if(this.array[j]>this.array[j+1])
                {
                    int temp = this.array[j];
                    this.array[j]=this.array[j+1];
                    this.array[j+1]=temp;
                    
                }
            }
        }
    }
    
}