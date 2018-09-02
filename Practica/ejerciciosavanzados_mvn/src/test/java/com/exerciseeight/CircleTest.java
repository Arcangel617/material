/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseeight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle circle;

    @Test
    public void shouldBuildAnEmptyCircle() {
        String expected = "Circle[radius=0.0,color=null]";
        circle = new Circle();
        assertEquals(expected, circle.toString());
    }

    @Test
    public void shouldBuildACircle() {
        String expected = "Circle[radius=4.0,color=null]";
        circle = new Circle(4);
        assertEquals(expected, circle.toString());
    }

    @Test
    public void shouldBuildAColoredCircle() {
        String expected = "Circle[radius=4.0,color=blue]";
        circle = new Circle(4,"blue");
        assertEquals(expected,circle.toString());
    }

    @Test
    public void shouldReturnCircleRadius() {
        Circle circle = new Circle();
        circle.setRadius(5);
        assertEquals(5, circle.getRadius(), 0);
    }

    @Test
    public void shouldReturnCircleColor() {
        Circle circle = new Circle();
        circle.setColor("red");
        assertEquals("red", circle.getColor());
    }

    @Test
    public void shouldReturnCircleArea() {
        Circle circle = new Circle(4);
        assertEquals(50.24, circle.getArea(), 1);
    }

}