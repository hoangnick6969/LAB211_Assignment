/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */

public class Cube extends ThreeDimensionalShape{
    double side;
    public Cube(double side){
        if(side<=0)System.out.println("Phai la so duong");
        this.side=side;
    }
    @Override
    public double getArea(){
        return 6*side*side;
    }
    @Override
    public double getVolume(){
        return side*side*side;
    }
    @Override
    public String toString(){
    return String.format("Cube[side=%.2f]", side);
}
}

