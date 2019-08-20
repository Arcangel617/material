/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio6Test {

    private Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void shouldReturnOddNumbersBetween100and1() {
        String expected = "99,97,95,93,91,89,87,85,83,81,79,77,75,73,71,69,67,65,63,61,59,57,55,53," +
                "51,49,47,45,43,41,39,37,35,33,31,29,27,25,23,21,19,17,15,13,11,9,7,5,3,1";
        String result = ejercicio6.returnOddNumbersBetween100and1();

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnOddNumbersSumBetween100and1(){
        int result = ejercicio6.returnOddNumbersSumFrom100to1();

        assertEquals(2499, result);
    }

}