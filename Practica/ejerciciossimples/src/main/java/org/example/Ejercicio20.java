package org.example;

public class Ejercicio20 {

  public static void main(String[] args) {
    int cont = 0;
    for (int i = 1; i <= 100; i++) {
      if (multiplo2(i) || multiplo3(i)) {
        cont++;
        System.out.println(i);
      }
    }
    System.out.println("Multiplos de 2 o 3: " + cont);
  }

  private static boolean multiplo2(int numero) {
    return numero % 2 == 0;
  }

  private static boolean multiplo3(int numero) {
    return numero % 3 == 0;
  }
}
