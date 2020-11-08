package org.example;

public class Ejercicio8 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    int count = 0;

    for (int i = 1; i < 100; i++) {
      if (i % 3 == 0) {
        count++;
        if (i == 99) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(",");
        }
      }
    }

    System.out.println("Multiplos de 3: " + stringBuilder.toString());
    System.out.println("Total: " + count);
  }
}
