/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class CalculatorShape {
    public void run() {
       Scanner scanner =new Scanner (System.in);
        System.out.println("Enter width and height of the rectangle");
        double recWidth =scanner.nextDouble();
        double recHeight=scanner.nextDouble();
        
        System.out.println("Enter radius of the circle");
        double circleRadius=scanner.nextDouble();
        
        System.out.println("Enter three sides of the triangle: ");
        double side1=scanner.nextDouble();
        double side2=scanner.nextDouble();
        double side3=scanner.nextDouble();
       
        if (!isValidTriangle(side1, side2, side3)) {
            System.err.println("Invalid triangle sides. The sum of any two sides must be greater than the third side.");
        } else {
        Rectangle rect=new Rectangle(recWidth, recHeight);
        Circle circle=new Circle(circleRadius);
        Triangle triangle=new Triangle(side1, side2, side3);
        
        System.out.println("\nResults: ss");
        rect.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
         private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printResult() {
        System.out.println("Rectangle - Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printResult() {
        System.out.println("Circle - Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class Triangle {
    private final double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public void printResult() {
        System.out.println("Triangle - Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}
