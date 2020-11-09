package org.example;

import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un nro: ");
    final int nro = scanner.nextInt();

    if (nro % 2 == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
  }
}
