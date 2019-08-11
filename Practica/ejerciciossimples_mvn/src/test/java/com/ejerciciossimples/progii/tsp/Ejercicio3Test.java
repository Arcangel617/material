package com.ejerciciossimples.progii.tsp;

import com.ejerciciossimples.progii.tsp.Ejercicio3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio3Test {

    private Ejercicio3 ejercicio3;

    @Before
    public void setup() {
        ejercicio3 = new Ejercicio3();
    }

    @Test
    public void returnSumFirst100IntegerNumbers() {
        assertEquals(4950, ejercicio3.returnSumFirst100IntegerNumbers());
    }
}