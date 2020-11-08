package org.example;

import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

    System.out.print("numero: ");
    final int number = scanner.nextInt();

    if (number > 0) {
      for (int i = 1; i <= number; i++) {
        if (i == number) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(" ");
        }
      }
    } else {
      stringBuilder.append(1);
    }

    System.out.println(stringBuilder.toString());
  }
}
