package org.example;

import java.util.Scanner;

public class Ejercicio23 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int menor;
    int mayor;
    int sum = 0;
    int count = 0;
    int pares = 0;

    System.out.print("nro1: ");
    final int nro1 = scanner.nextInt();
    System.out.print("nro2: ");
    final int nro2 = scanner.nextInt();

    if (nro1 < nro2) {
      menor = nro1;
      mayor = nro2;
    } else {
      menor = nro2;
      mayor = nro1;
    }

    for (int i = menor; i <= mayor; i++) {
      if (i > 0) {
        stringBuilder.append(i).append(" ");
        count++;
        if (i % 2 == 0) {
          pares++;
        } else {
          sum += i;
        }
      }
    }

    System.out.println("Nro1: " + nro1);
    System.out.println("Nro2: " + nro2);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Total: " + count);
    System.out.println("Pares: " + pares);
    System.out.println("Suma impares: " + sum);
  }
}
