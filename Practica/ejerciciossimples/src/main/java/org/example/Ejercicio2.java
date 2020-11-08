/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package org.example;

public class Ejercicio2 {

  public String returnNumbersFrom100to0() {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 100; i >= 0; i--) {
      if (i != 0) {
        stringBuilder.append(i).append(",");
      } else {
        stringBuilder.append(i);
      }
    }

    return stringBuilder.toString();
  }
}