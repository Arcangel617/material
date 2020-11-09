package org.example;

import java.util.Scanner;

public class Ejercicio29 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int pares = 0;
    int nro2;

    System.out.print("nro1: ");
    final int nro1 = scanner.nextInt();
    do {
      System.out.print("nro2: ");
      nro2 = scanner.nextInt();
      if (nro2 < nro1) {
        System.out.println("El segundo nro debe ser mayor!");
      }
    } while (nro2 < nro1);

    for (int i = nro1; i <= nro2; i += 7) {
      stringBuilder.append(i).append(" ");
      if (i % 2 == 0) {
        pares++;
      } else {
        sum += i;
      }
    }

    System.out.println("Nro1: " + nro1);
    System.out.println("Nro2: " + nro2);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Pares: " + pares);
    System.out.println("Suma impares: " + sum);
  }
}
