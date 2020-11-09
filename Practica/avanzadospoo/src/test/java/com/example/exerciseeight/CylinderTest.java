package com.example.exerciseeight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CylinderTest {

    @Test
    void shouldBuildAnEmptyCylinder() {
        Cylinder cylinder = new Cylinder();
        String expected = "Cylinder[height=1.0,radius=0.0,color=null]";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    void shouldBuildACylinder() {
        Cylinder cylinder = new Cylinder(3);
        String expected = "Cylinder[height=1.0,radius=3.0,color=null]";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    void shouldBuildAColoredCylinder() {
        Cylinder cylinder = new Cylinder(3, 3,"blue");
        String expected = "Cylinder[height=3.0,radius=3.0,color=blue]";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    void shouldUpdateCylinderHeight() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        assertEquals(5, cylinder.getHeight(),0);
    }

    @Test
    void shouldReturnCylinderVolume() {
        Cylinder cylinder = new Cylinder(3, 3,"blue");
        assertEquals(84.74, cylinder.getVolume(),1);
    }
}