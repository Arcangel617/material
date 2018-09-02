/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseten;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square square;

    @Test
    public void shouldBuildAnEmptySquare() {
        String expected = "Square[side=0.0,color=null,filled=false]";
        square = new Square();
        assertEquals(expected, square.toString());
    }

    @Test
    public void shouldBuildASquare() {
        String expected = "Square[side=5.0,color=null,filled=false]";
        square = new Square(5);
        assertEquals(expected, square.toString());
    }

    @Test
    public void shouldBuildAColoredSquare() {
        String expected = "Square[side=5.0,color=green,filled=true]";
        square = new Square(5,"green",true);
        assertEquals(expected, square.toString());
    }

    @Test
    public void shouldUpdateSquareSide() {
        square = new Square();
        assertEquals(0,square.getSide(),0);
        square.setSide(6);
        assertEquals(6,square.getSide(),0);
    }

    @Test
    public void shouldUpdateSquareSideUsingOverridenInheritMethodSetWidth() {
        square = new Square();
        assertEquals(0,square.getSide(),0);
        square.setWidth(6);
        assertEquals(6,square.getSide(),0);
    }

    @Test
    public void shouldUpdateSquareSideUsingOverridenInheritMethodSetLenght() {
        square = new Square();
        assertEquals(0,square.getSide(),0);
        square.setLength(6);
        assertEquals(6,square.getSide(),0);
    }
}