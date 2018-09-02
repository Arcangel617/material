/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle circle;

    @Test
    public void shouldBuildAnEmptyCircle() {
        String expected = "Circle[radius=1.0]";
        circle = new Circle();
        assertEquals(expected,circle.toString());
    }

    @Test
    public void shouldBuildACircle() {
        String expected = "Circle[radius=4.0]";
        circle = new Circle(4);
        assertEquals(expected,circle.toString());
    }

    @Test
    public void shouldUpdateCircleRadius() {
        circle = new Circle();
        assertEquals(1,circle.getRadius(),0);
        circle.setRadius(5);
        assertEquals(5,circle.getRadius(),0);
    }

    @Test
    public void shouldReturnCircleCirumference() {
        circle = new Circle(5);
        assertEquals(31.4,circle.getCirumference(),1);
    }

    @Test
    public void shouldReturnCircleArea() {
        circle = new Circle(5);
        assertEquals(78.5,circle.getArea(),1);
    }
}