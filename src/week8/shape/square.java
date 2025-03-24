/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
public class square extends TwoDimensionalShape{
         double side;
         public square(double side){
             if(side<=0){
                 System.out.println("phai la so duong");
             }
             this.side=side;
         }
         public double getSide(){
             return side;
         }
         @Override
         public double getArea(){
             return side*side;
         }
         @Override
         public String toString(){
             return String.format("Square[side=%.2f]", side);
         }
     }