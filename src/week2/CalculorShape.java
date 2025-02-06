/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author PC
 */

public class CalculorShape {
    public void run() {
        System.out.println("Testing Shapes:");
        Rectangle rect = new Rectangle(5, 10);
        rect.printResult();
        Circle circle = new Circle(7);
        circle.printResult();
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printResult();
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
