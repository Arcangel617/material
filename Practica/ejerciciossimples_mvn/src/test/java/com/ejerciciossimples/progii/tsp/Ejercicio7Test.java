package com.ejerciciossimples.progii.tsp;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(ZohhakRunner.class)
public class Ejercicio7Test {

    private Ejercicio7 ejercicio7 = new Ejercicio7();

    @TestWith({
            "5 , 1 2 3 4 5",
            "0 , 1",
            "-5, 1"
    })
    public void returnNaturalNumbersFrom1toTheGivenNumber(int number, String expected) {
        String result = ejercicio7.returnNaturalNumbersFrom1toTheGivenNumber(number);

        assertEquals(expected, result);
    }
}