package com.ejerciciossimples.progii.tsp;

import com.ejerciciossimples.progii.tsp.Ejercicio5;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio5Test {

    private Ejercicio5 ejercicio5;

    @Before
    public void setUp() {
        ejercicio5 = new Ejercicio5();
    }

    @Test
    public void countOddNumbersBetween0and100() {
        assertEquals(50, ejercicio5.countOddNumbersBetween0and100());
    }

    @Test
    public void returnOddNumbersBetween0and100() {
        String expected = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49," +
                "51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99";
        assertEquals(expected, ejercicio5.returnOddNumbersBetween0and100());
    }
}