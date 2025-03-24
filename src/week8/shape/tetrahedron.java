/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */

public class tetrahedron extends ThreeDimensionalShape{
    double edge;
    public tetrahedron(double edge){
        if(edge<=0)System.out.println("phai la so duong");
        this.edge=edge;
    }
    
    @Override
    public double getArea(){
        return Math.sqrt(3)*edge*edge;
    }
    @Override
    public double getVolume(){
        return (1/2)*Math.sqrt(2)*edge*edge*edge;
    }
    @Override
    public String toString(){
        return String.format("tetrahedron[egde=%.2f]",edge);
    }
}