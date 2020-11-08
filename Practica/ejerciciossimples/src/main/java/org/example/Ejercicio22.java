package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[5];

    System.out.println("Ingrese cinco numeros: ");
    for (int i = 0; i < 5; i++){
      System.out.print("[" + i + "] = ");
      numeros[i] = scanner.nextInt();
    }

    System.out.println("Max: " + Arrays.stream(numeros).max().getAsInt());
    System.out.println("Min: " + Arrays.stream(numeros).min().getAsInt());
  }
}
