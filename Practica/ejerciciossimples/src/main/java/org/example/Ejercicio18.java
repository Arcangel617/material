package org.example;

import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    System.out.print("Ingrese un nro: ");
    final int nro = scanner.nextInt();

    if (nro < 1) {
      for (int i = 1; i > nro; i--) {
        if (i % 3 == 0) {
          stringBuilder.append(i).append(" ");
          count++;
        }
      }
    } else {
      for (int i = 1; i < nro; i++) {
        if (i % 3 == 0) {
          stringBuilder.append(i).append(" ");
          count++;
        }
      }
    }

    System.out.println("Nro: " + nro);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Total: " + count);
  }
}
