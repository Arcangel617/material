/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseeight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CylinderTest {

    @Test
    public void shouldBuildAnEmptyCylinder() {
        Cylinder cylinder = new Cylinder();
        String expected = "Cylinder[height=1.0,radius=0.0,color=null]";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    public void shouldBuildACylinder() {
        Cylinder cylinder = new Cylinder(3);
        String expected = "Cylinder[height=1.0,radius=3.0,color=null]";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    public void shouldBuildAColoredCylinder() {
        Cylinder cylinder = new Cylinder(3, 3,"blue");
        String expected = "Cylinder[height=3.0,radius=3.0,color=blue]";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    public void shouldUpdateCylinderHeight() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        assertEquals(5, cylinder.getHeight(),0);
    }

    @Test
    public void shouldReturnCylinderVolume() {
        Cylinder cylinder = new Cylinder(3, 3,"blue");
        assertEquals(84.74, cylinder.getVolume(),1);
    }
}