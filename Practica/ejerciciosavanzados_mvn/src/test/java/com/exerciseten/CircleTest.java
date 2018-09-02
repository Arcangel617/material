/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseten;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle circle;

    @Test
    public void shouldBuildAnEmptyCircle() {
        String expected = "Circle[radius=0.0,color=null,filled=false]";
        circle = new Circle();
        assertEquals(expected, circle.toString());
    }

    @Test
    public void shouldBuildACircle() {
        String expected = "Circle[radius=4.0,color=null,filled=false]";
        circle = new Circle(4);
        assertEquals(expected, circle.toString());
    }

    @Test
    public void shouldBuildAColoredCircle() {
        String expected = "Circle[radius=4.0,color=white,filled=true]";
        circle = new Circle(4,"white", true);
        assertEquals(expected, circle.toString());
    }

    @Test
    public void shouldUpdateCircleRadius() {
        circle = new Circle();
        assertEquals(0, circle.getRadius(),0);
        circle.setRadius(6);
        assertEquals(6, circle.getRadius(),0);
    }

    @Test
    public void shouldReturnCircleArea() {
        circle = new Circle(4);
        assertEquals(50.24, circle.getArea(),1);
    }

    @Test
    public void shouldReturnCirclePerimeter() {
        circle = new Circle(4);
        assertEquals(25.12, circle.getPerimeter(),1);
    }
}