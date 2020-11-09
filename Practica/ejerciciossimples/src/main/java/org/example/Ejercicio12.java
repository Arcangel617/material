package org.example;

import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;

    System.out.print("Ingrese un nro: ");
    final int nro = scanner.nextInt();

    for (int i = 0; i <= nro; i++) {
      if (i % 10 == 0) {
        sum += i;
        count++;
        stringBuilder.append(i).append(" ");
      }
    }

    System.out.println("Numero: " + nro);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Total: " + count);
    System.out.println("Suma: " + sum);
  }
}
