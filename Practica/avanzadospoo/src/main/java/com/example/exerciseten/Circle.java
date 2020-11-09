package com.example.exerciseten;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

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
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
