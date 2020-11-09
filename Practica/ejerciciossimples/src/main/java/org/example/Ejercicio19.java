package org.example;

public class Ejercicio19 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    int impar = 0;
    int par = 0;

    for (int i = 1; i <= 100; i++) {
      stringBuilder.append(i).append(" ");
      if (i % 2 == 0) {
        par++;
      } else {
        impar++;
      }
    }

    System.out.println("Lista: " + stringBuilder.toString());
    System.out.println("Pares: " + par);
    System.out.println("Impares: " + impar);
  }
}
