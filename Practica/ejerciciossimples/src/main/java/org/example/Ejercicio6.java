package org.example;

public class Ejercicio6 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    int suma = 0;

    for (int i = 100; i > 0; i--) {
      if (i % 2 != 0) {
        suma = suma + i;
        if (i == 1) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(",");
        }
      }
    }

    System.out.println("Numeros impares: " + stringBuilder.toString());
    System.out.println("Suma: " + suma);
  }
}
