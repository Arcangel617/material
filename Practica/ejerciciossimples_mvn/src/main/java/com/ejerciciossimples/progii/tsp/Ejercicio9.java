/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

public class Ejercicio9 {

	public int returnSumMultipleOf3Between0And100() {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sum +=  i;
			}
		}

		return sum;
	}
}
