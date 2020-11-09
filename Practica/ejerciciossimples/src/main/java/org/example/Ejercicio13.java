package org.example;

import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    int nro;

    System.out.println("Ingrese un nro menor a 500");
    do {
      System.out.print("nro: ");
      nro = scanner.nextInt();
      if (nro > 500) {
        System.out.println("El numero debe ser menor a 500!");
      }
    } while (nro > 500);

    for (int i = nro; i <= 500; i+=8) {
      sum += i;
      count += 1;
      stringBuilder.append(i).append(" ");
    }

    System.out.println("Numero: " + nro);
    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Total: " + count);
    System.out.println("Suma: " + sum);
  }
}
