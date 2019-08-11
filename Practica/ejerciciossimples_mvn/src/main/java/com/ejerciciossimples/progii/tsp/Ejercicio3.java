package com.ejerciciossimples.progii.tsp;

/**
 * Hacer​ ​ un​ ​ programa​ ​ que​ ​ imprima​ ​ las​ ​ sumas​ ​ de​ ​ los​ ​ 100​ ​ primeros​ ​ números​ ​ enteros
 */

public class Ejercicio3 {

    public int returnSumFirst100IntegerNumbers() {
        int sum = 0;

		for (int i = 0; i < 100 ; i++) {
			sum = sum  + i;
		}

		return sum;
    }
}