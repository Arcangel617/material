package org.example;

public class Ejercicio4 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0 && i != 0) {
        if (i != 100) {
          stringBuilder.append(i).append(",");
        } else {
          stringBuilder.append(i);
        }
      }
    }

    System.out.println(stringBuilder.toString());
  }
}