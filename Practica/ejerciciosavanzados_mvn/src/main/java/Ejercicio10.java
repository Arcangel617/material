/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

import java.util.ArrayList;

import static java.lang.Math.*;
import static java.lang.Math.pow;

abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() { }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + color +", filled=" + filled + "]";
    }


}

class Circle extends Shape {

    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + ",filled=" + filled + "]";
    }
}

class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double lenght) {
        this.length = lenght;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
    }
}

class Square extends Rectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return length;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        return "Square[side=" + getSide() + ",color=" + color + ",filled=" + filled + "]";
    }
}

class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle());
        shapes.add(new Circle(5));
        shapes.add(new Circle(5, "Red", true));
        shapes.add(new Rectangle());
        shapes.add(new Rectangle(3,4));
        shapes.add(new Rectangle(3,4, "Blue", false));
        shapes.add(new Square());
        shapes.add(new Square(5));
        shapes.add(new Square(6, "Green", true));

        for (Shape shape: shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

    }
}
