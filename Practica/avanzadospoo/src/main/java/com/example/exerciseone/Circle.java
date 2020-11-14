package com.example.exerciseone;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {

  private double radius = 1.0;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getCircumference() {
    return 2 * PI * radius;
  }

  public double getArea() {
    return PI * pow(radius, 2);
  }

  public String toString() {
    return "Circle[radius=" + radius + "]";
  }
}
