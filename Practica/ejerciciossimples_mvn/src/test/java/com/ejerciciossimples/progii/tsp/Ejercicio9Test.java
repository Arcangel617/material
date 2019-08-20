/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio9Test {

    private Ejercicio9 ejercicio9 = new Ejercicio9();

    @Test
    public void souhldReturnSumMultipleOf3Between0And100() {
        int result = ejercicio9.returnSumMultipleOf3Between0And100();

        assertEquals(2500, result);
    }
}