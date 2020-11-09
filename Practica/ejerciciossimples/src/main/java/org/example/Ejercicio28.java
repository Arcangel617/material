package org.example;

import java.util.Scanner;

public class Ejercicio28 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String next = "";
    int max = 0;
    int sum = 0;
    int count = 0;

    while (!next.equals("n")) {
      System.out.print("Ingrese un nro: ");
      String value = scanner.next();
      int nro = Integer.parseInt(value);

      if (nro % 5 == 0) {
        sum += nro;
      }

      if (nro > max) {
        max = nro;
      }
      count++;

      System.out.println("continuar? s/n");
      next = scanner.next();
    }

    System.out.println("Total: " + count);
    System.out.println("Suma: " + sum);
    System.out.println("Mayor: " + max);
  }
}
