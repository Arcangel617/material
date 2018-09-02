/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseten;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShapeTest {

    private Shape shape;

    @Before
    public void setup() {
        shape = new Shape("black",true) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
    }

    @Test
    public void shouldBuildAnEmptyShape() {
        String expected = "Shape[color=null,filled=false]";
        shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertEquals(expected, shape.toString());
    }

    @Test
    public void shouldBuildAShape() {
        String expected = "Shape[color=black,filled=true]";
        assertEquals(expected, shape.toString());
    }

    @Test
    public void shouldReturnShapeColor() {
        assertEquals("black", shape.getColor());
    }

    @Test
    public void shouldUpdateShapeColor() {
        assertEquals("black", shape.getColor());
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    public void shouldCheckShapedisFilled() {
        assertTrue(shape.isFilled());
    }

    @Test
    public void shouldUpdateAndCheckShapeIsNotFilled() {
        assertTrue(shape.isFilled());
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }
}