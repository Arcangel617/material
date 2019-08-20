/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio3Test {

    private Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void returnSumFirst100IntegerNumbers() {
        int result = ejercicio3.returnTheSumFirst100IntegerNumbers();

        assertEquals(4950, result);
    }
}