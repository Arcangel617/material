/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package org.example;

public class Ejercicio7 {

  public String returnNaturalNumbersFrom1toTheGivenNumber(int number) {
    StringBuilder stringBuilder = new StringBuilder();
    if (isNaturalNumber(number)) {
      for (int i = 1; i <= number; i++) {
        if (i == number) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(" ");
        }
      }
    } else {
      stringBuilder.append(1);
    }
    return stringBuilder.toString();
  }

  private boolean isNaturalNumber(int number) {
    return number > 0;
  }

}
