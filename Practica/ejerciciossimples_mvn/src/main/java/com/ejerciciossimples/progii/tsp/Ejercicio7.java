package com.ejerciciossimples.progii.tsp;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		System.out.print("> ");
		number = scanner.nextInt();

		for (int i = 1; i <= number ; i++) {
			System.out.print(i + " ");
		}

	}
}