package com.example.exerciseten;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest {

  private Circle circle;

  @Test
  void shouldBuildAnEmptyCircle() {
    String expected = "Circle[radius=0.0,color=null,filled=false]";
    circle = new Circle();
    assertEquals(expected, circle.toString());
  }

  @Test
  void shouldBuildACircle() {
    String expected = "Circle[radius=4.0,color=null,filled=false]";
    circle = new Circle(4);
    assertEquals(expected, circle.toString());
  }

  @Test
  void shouldBuildAColoredCircle() {
    String expected = "Circle[radius=4.0,color=white,filled=true]";
    circle = new Circle(4, "white", true);
    assertEquals(expected, circle.toString());
  }

  @Test
  void shouldUpdateCircleRadius() {
    circle = new Circle();
    assertEquals(0, circle.getRadius(), 0);
    circle.setRadius(6);
    assertEquals(6, circle.getRadius(), 0);
  }

  @Test
  void shouldReturnCircleArea() {
    circle = new Circle(4);
    assertEquals(50.24, circle.getArea(), 1);
  }

  @Test
  void shouldReturnCirclePerimeter() {
    circle = new Circle(4);
    assertEquals(25.12, circle.getPerimeter(), 1);
  }
}