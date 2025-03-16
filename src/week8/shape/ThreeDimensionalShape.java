/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.shape;

/**
 *
 * @author PC
 */
abstract class ThreeDimensionalShape extends Shape {
    @Override
    public abstract double getArea();
    public abstract double getVolume();
    @Override
    public abstract String toString();
}
class Sphere extends ThreeDimensionalShape{
    double radius;
    public Sphere(double radius){
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

class Cube extends ThreeDimensionalShape{
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
class tetrahedron extends ThreeDimensionalShape{
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