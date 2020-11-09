package org.example;

import java.util.Scanner;

public class Ejercicio25 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String next = "";

    while (!next.equals("n")) {
      System.out.print("Ingrese un nro: ");
      String value = scanner.next();
      int nro = Integer.parseInt(value);
      if (nro % 2 == 0) {
        System.out.println("El nro no puede ser par!");
      } else {
        System.out.println(nro);
      }

      System.out.println("continuar? s/n");
      next = scanner.next();
    }
  }
}
