package org.example;

import java.util.Scanner;

public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String next = "";

    while (!next.equals("n")) {
      System.out.print("Ingrese un nro: ");
      String value = scanner.next();
      int nro = Integer.parseInt(value);
      if (nro < 10) {
        System.out.println("Es menor");
      } else if (nro > 10){
        System.out.println("Es mayor");
      } else {
        System.out.println("Es igual");
      }

      System.out.println("continuar? s/n");
      next = scanner.next();
    }
  }
}
