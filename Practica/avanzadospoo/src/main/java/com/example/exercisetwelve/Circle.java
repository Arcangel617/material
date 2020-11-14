package com.example.exercisetwelve;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements GeometricObject {

  protected double radius = 1;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getPerimeter() {
    return 2 * PI * radius;
  }

  public double getArea() {
    return PI * pow(radius, 2);
  }

  public String toString() {
    return "Cirlce[radius=" + radius + "]";
  }
}
