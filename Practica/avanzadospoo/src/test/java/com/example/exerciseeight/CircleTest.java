package com.example.exerciseeight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest {

    private Circle circle;

    @Test
    void shouldBuildAnEmptyCircle() {
        String expected = "Circle[radius=0.0,color=null]";
        circle = new Circle();
        assertEquals(expected, circle.toString());
    }

    @Test
    void shouldBuildACircle() {
        String expected = "Circle[radius=4.0,color=null]";
        circle = new Circle(4);
        assertEquals(expected, circle.toString());
    }

    @Test
    void shouldBuildAColoredCircle() {
        String expected = "Circle[radius=4.0,color=blue]";
        circle = new Circle(4,"blue");
        assertEquals(expected,circle.toString());
    }

    @Test
    void shouldReturnCircleRadius() {
        Circle circle = new Circle();
        circle.setRadius(5);
        assertEquals(5, circle.getRadius(), 0);
    }

    @Test
    void shouldReturnCircleColor() {
        Circle circle = new Circle();
        circle.setColor("red");
        assertEquals("red", circle.getColor());
    }

    @Test
    void shouldReturnCircleArea() {
        Circle circle = new Circle(4);
        assertEquals(50.24, circle.getArea(), 1);
    }

}