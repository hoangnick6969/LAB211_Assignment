/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
public class triangle extends TwoDimensionalShape{
    double height,base;
    public triangle(double base,double height){
    if(base<=0||height<=0){
            System.out.println("Phai la so duong");
    }
    this.base=base;
    this.height=height;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    @Override   
    public String toString(){
        return String.format("Triangle[base=%.2f,height=%.2f]",base,height);
    }
}
