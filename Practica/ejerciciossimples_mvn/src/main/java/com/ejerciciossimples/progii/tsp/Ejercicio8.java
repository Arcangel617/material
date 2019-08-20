/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

public class Ejercicio8 {
	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i < 100 ; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\nMultiplos de 3: " + count);
	}
}