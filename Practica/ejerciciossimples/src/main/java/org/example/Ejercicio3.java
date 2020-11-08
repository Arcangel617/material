/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package org.example;

public class Ejercicio3 {

  public int returnTheSumFirst100IntegerNumbers() {
    int sum = 0;

    for (int i = 0; i < 100; i++) {
      sum = sum + i;
    }

    return sum;
  }

}