package com.example.exerciseone;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest {

    private Circle circle;

    @Test
    void shouldBuildAnEmptyCircle() {
        String expected = "Circle[radius=1.0]";
        circle = new Circle();
        assertEquals(expected,circle.toString());
    }

    @Test
    void shouldBuildACircle() {
        String expected = "Circle[radius=4.0]";
        circle = new Circle(4);
        assertEquals(expected,circle.toString());
    }

    @Test
    void shouldUpdateCircleRadius() {
        circle = new Circle();
        assertEquals(1,circle.getRadius(),0);
        circle.setRadius(5);
        assertEquals(5,circle.getRadius(),0);
    }

    @Test
    void shouldReturnCircleCirumference() {
        circle = new Circle(5);
        assertEquals(31.4,circle.getCirumference(),1);
    }

    @Test
    void shouldReturnCircleArea() {
        circle = new Circle(5);
        assertEquals(78.5,circle.getArea(),1);
    }
}