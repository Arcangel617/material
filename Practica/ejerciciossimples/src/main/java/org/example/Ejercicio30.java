package org.example;

import java.util.Scanner;

public class Ejercicio30 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double result = 0;

    System.out.print("Ingrese nro: ");
    final int nro = scanner.nextInt();

    if (nro < 500) {
      result = nro + (nro * 0.5);
    } else if (nro < 1000) {
      result = nro + (nro * 0.07);
    } else if (nro <= 5000) {
      result = nro - (nro * 0.05);
    } else {
      result = nro;
    }

    System.out.println(result);
  }
}
