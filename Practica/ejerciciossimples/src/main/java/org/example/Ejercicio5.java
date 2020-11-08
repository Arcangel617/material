package org.example;

public class Ejercicio5 {

  public static void main(String[] args) {
    int count = 0;
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < 100; i++) {
      if (i % 2 != 0) {
        count++;
        if (i != 99) {
          stringBuilder.append(i).append(",");
        } else {
          stringBuilder.append(i);
        }
      }
    }

    System.out.println("Odd numbers: " + stringBuilder.toString());
    System.out.println("Total: " + count);
  }
}