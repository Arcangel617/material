package com.ejerciciossimples.progii.tsp;

public class Ejercicio10 {
	
	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i < 500 ; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
				count++;			
			}
		}

		System.out.println("\nMultiplos de 5: " + count);

	}
}