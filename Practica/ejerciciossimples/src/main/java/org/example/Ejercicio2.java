package org.example;

public class Ejercicio2 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 100; i >= 0; i--) {
      if (i != 0) {
        stringBuilder.append(i).append(",");
      } else {
        stringBuilder.append(i);
      }
    }
    System.out.println(stringBuilder.toString());
  }
}