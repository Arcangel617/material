package org.example;

public class Ejercicio1 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i <= 100; i++) {
      if (i != 100) {
        stringBuilder.append(i).append(",");
      } else {
        stringBuilder.append(i);
      }
    }

    System.out.println(stringBuilder.toString());
  }
}
