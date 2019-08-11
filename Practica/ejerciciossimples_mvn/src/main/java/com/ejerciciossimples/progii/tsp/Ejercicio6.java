package com.ejerciciossimples.progii.tsp;

public class Ejercicio6 {
	public static void main(String[] args) {
		int suma = 0;

		for (int i = 100; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				suma = suma + i;
			}
		}

		System.out.println("\nSuma: " + suma);
	}
}