/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
//hinh 2D 
abstract class TwoDimensionalShape extends Shape {
    @Override
    public abstract double getArea();
    @Override
    public abstract String toString();
}
class circle extends TwoDimensionalShape{
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
     class square extends TwoDimensionalShape{
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
class triangle extends TwoDimensionalShape{
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
