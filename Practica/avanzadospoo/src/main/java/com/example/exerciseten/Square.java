package com.example.exerciseten;

public class Square extends Rectangle {

  public Square() {
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() {
    return length;
  }

  public void setSide(double side) {
    this.length = side;
    this.width = side;
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
