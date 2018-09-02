/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseten;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @Test
    public void shouldBuildAnEmptyRectangle() {
        String expected = "Rectangle[width=0.0,length=0.0,color=null,filled=false]";
        rectangle = new Rectangle();
        assertEquals(expected, rectangle.toString());
    }

    @Test
    public void shouldBuildARectangle() {
        String expected = "Rectangle[width=3.0,length=4.0,color=null,filled=false]";
        rectangle = new Rectangle(3,4);
        assertEquals(expected, rectangle.toString());
    }

    @Test
    public void shouldBuildAColoredRectangle() {
        String expected = "Rectangle[width=2.0,length=4.0,color=black,filled=true]";
        rectangle = new Rectangle(2,4,"black",true);
        assertEquals(expected, rectangle.toString());
    }

    @Test
    public void shouldUpdateRectangleWidth() {
        rectangle = new Rectangle();
        assertEquals(0, rectangle.getWidth(), 0);
        rectangle.setWidth(6);
        assertEquals(6, rectangle.getWidth(), 0);
    }

    @Test
    public void shouldUpdateRectangleLength() {
        rectangle = new Rectangle();
        assertEquals(0, rectangle.getLength(),0);
        rectangle.setLength(3);
        assertEquals(3, rectangle.getLength(),0);
    }

    @Test
    public void shouldReturnRectangleArea() {
        rectangle = new Rectangle(3,4);
        assertEquals(12,rectangle.getArea(),0);
    }

    @Test
    public void shouldReturnRectanglePerimeter() {
        rectangle = new Rectangle(3,4);
        assertEquals(14, rectangle.getPerimeter(), 0);
    }
}