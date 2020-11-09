package org.example;

import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int nro;

    System.out.println("Introduce un numero menor que 100");
    do {
      System.out.print("nro: ");
      nro = scanner.nextInt();
      if (nro > 100) {
        System.out.println("El numero debe ser menor a 100!");
      }
    } while (nro > 100);

    for (int i = nro; i < 100; i+=4) {
      sum += Math.pow(i ,2);
    }

    System.out.println("suma: " + sum);
  }
}
