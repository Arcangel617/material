package org.example;

import java.util.Scanner;

public class Ejercicio26 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int sumMult5 = 0;
    int sum = 0;

    System.out.print("Ingrese un nro: ");
    int nro = scanner.nextInt();

    for (int i = 0; i <= nro; i++) {
      if (i % 5 == 0) {
        sumMult5  += i;
      } else {
        sum += i;
        stringBuilder.append(i).append(" ");
      }
    }

    System.out.println("Nro: " + nro);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Suma: " + sum);
    System.out.println("Suma multiplos de 5: " + sumMult5);
  }
}
