/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

public class Ejercicio8 {

	public int countMultiplesOf3Between1and100() {
		int count = 0;

		for (int i = 1; i < 100 ; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}

		return count;
	}

	public String returnMultiplesOf3Between1And100() {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 1; i < 100 ; i++) {
			if (i % 3 == 0) {
				if (i == 99) {
					stringBuilder.append(i);
				} else {
					stringBuilder.append(i).append(",");
				}
			}
		}

		return stringBuilder.toString();
	}
}
