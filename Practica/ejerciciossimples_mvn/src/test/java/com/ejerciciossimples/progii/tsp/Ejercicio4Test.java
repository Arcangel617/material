package com.ejerciciossimples.progii.tsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio4Test {

    private Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void returnEvenNumbersBetween0and100() {
        String expected = "2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56," +
                "58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,90,92,94,96,98,100";

        String result = ejercicio4.returnEvenNumbersBetween0and100();

        assertEquals(expected, result);
    }

}
