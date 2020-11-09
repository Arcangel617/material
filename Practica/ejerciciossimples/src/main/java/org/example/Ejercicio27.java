package org.example;

import java.util.Scanner;

public class Ejercicio27 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    System.out.print("Ingrese un nro: ");
    int nro = scanner.nextInt();

    for (int i = 1; i <= nro; i++) {
      if ((i % 2 == 0) && (i % 3 == 0)) {
        count += i;
        stringBuilder.append(i).append(" ");
      }
    }

    System.out.println("Nro: " + nro);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Total: " + count);
  }
}
