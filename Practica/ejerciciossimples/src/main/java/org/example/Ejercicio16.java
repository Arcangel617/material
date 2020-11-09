package org.example;

import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nro: ");
    final int nro = scanner.nextInt();

    if (nro < 0) {
      System.out.println("negativo");
    } else if (nro > 0) {
      System.out.println("positivo");
    } else {
      System.out.println("el nro es 0");
    }
  }
}
