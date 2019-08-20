/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio8Test {

    private Ejercicio8 ejercicio8 = new Ejercicio8();

    @Test
    public void shouldReturnMultiplesOf3Between1And100() {
        String expected = "3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,66,69,72,75,78,81,84,87,90,93,96,99";
        String result = ejercicio8.returnMultiplesOf3Between1And100();

        assertEquals(expected, result);
    }

    @Test
    public void shouldCountMultiplesOf3Between1And100() {
        int result = ejercicio8.countMultiplesOf3Between1and100();

        assertEquals(33, result);
    }
}
