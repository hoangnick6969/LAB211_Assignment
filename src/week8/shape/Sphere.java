/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
class Sphere extends ThreeDimensionalShape{
    double radius;
    public Sphere(int radius){
        if(radius<=0) System.out.println("phai la so duong");
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return 4*Math.PI*radius*radius;
    }
    public double getVolume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }
    @Override
    public String toString(){
        return String.format("Sphere[radius=%.2f]", radius);
    }
}