/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[]args){
        Shape[]shapes={
            new square(4),new circle(5),new triangle(6, 3),new Sphere(3),new Cube(6),new tetrahedron(4)
            
        };
        
        for(Shape shape:shapes){
            System.out.println("Shape:"+shape);
            
            //
            
            
        }System.out.println();
    }
}
