/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
public class circle extends TwoDimensionalShape{
     private double radius;
     public circle(double radius){
         if(radius<=0){
             System.out.println("phai la so duong");
         }
         this.radius=radius;
     }
     public double getRadius(){
         return radius;
     }
     
     @Override
     public double getArea(){
         return Math.PI*radius*radius;
     }
     @Override
     public String toString(){
         return String.format ("Circle[radius=%.2f]",radius);
     }
}
