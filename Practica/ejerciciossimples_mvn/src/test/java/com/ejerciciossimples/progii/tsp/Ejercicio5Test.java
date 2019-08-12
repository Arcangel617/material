package com.ejerciciossimples.progii.tsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio5Test {

    private Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void shouldCountOddNumbersBetween0and100() {
        int result = ejercicio5.countOddNumbersBetween0and100();

        assertEquals(50, result);
    }

    @Test
    public void shouldReturnOddNumbersBetween0and100() {
        String expected = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49," +
                "51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99";

        String result = ejercicio5.returnOddNumbersBetween0and100();

        assertEquals(expected, result);
    }

}
