package org.example;

public class Ejercicio10 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    int count = 0;

    for (int i = 1; i < 500; i++) {
      if (i % 5 == 0) {
        count++;
        if (i == 495) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(",");
        }
      }
    }

    System.out.println("Multiplos de 5: " + stringBuilder.toString());
    System.out.println("Total: " + count);
  }
}
