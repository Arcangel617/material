/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package org.example;

public class Ejercicio6 {

  public String returnOddNumbersBetween100and1() {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 100; i > 0; i--) {
      if (i % 2 != 0) {
        if (i == 1) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(",");
        }
      }
    }

    return stringBuilder.toString();
  }

  public int returnOddNumbersSumFrom100to1() {
    int suma = 0;

    for (int i = 100; i > 1; i--) {
      if (i % 2 != 0) {
        suma = suma + i;
      }
    }

    return suma;
  }

}
