package com.example.exerciseten;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareTest {

    private Square square;

    @Test
    void shouldBuildAnEmptySquare() {
        String expected = "Square[side=0.0,color=null,filled=false]";
        square = new Square();
        assertEquals(expected, square.toString());
    }

    @Test
    void shouldBuildASquare() {
        String expected = "Square[side=5.0,color=null,filled=false]";
        square = new Square(5);
        assertEquals(expected, square.toString());
    }

    @Test
    void shouldBuildAColoredSquare() {
        String expected = "Square[side=5.0,color=green,filled=true]";
        square = new Square(5,"green",true);
        assertEquals(expected, square.toString());
    }

    @Test
    void shouldUpdateSquareSide() {
        square = new Square();
        assertEquals(0,square.getSide(),0);
        square.setSide(6);
        assertEquals(6,square.getSide(),0);
    }

    @Test
    void shouldUpdateSquareSideUsingOverridenInheritMethodSetWidth() {
        square = new Square();
        assertEquals(0,square.getSide(),0);
        square.setWidth(6);
        assertEquals(6,square.getSide(),0);
    }

    @Test
    void shouldUpdateSquareSideUsingOverridenInheritMethodSetLenght() {
        square = new Square();
        assertEquals(0,square.getSide(),0);
        square.setLength(6);
        assertEquals(6,square.getSide(),0);
    }
}