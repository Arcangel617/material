/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseone;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {

    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCirumference() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * pow(radius,2);
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
