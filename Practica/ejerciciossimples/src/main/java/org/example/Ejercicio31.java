package org.example;

import java.util.Scanner;

public class Ejercicio31 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un nro: ");
    int nro = scanner.nextInt();
    int max = nro + 100;

    for (int i = nro; i <= max; i++) {
      System.out.println(nextFibo(i));
    }
  }

  private static double aureo() {
    return (1 + Math.sqrt(5)) / 2;
  }

  private static long nextFibo(int position) {
    double calc = (Math.pow(aureo(), position) - Math.pow((1 - aureo()), position)) / Math.sqrt(5);
    return (long) Math.floor(calc);
  }
}
