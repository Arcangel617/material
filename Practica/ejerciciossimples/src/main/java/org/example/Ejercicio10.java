/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package org.example;

public class Ejercicio10 {

  public int countMultiplesOf5Between1and500() {
    int count = 0;

    for (int i = 1; i < 500; i++) {
      if (i % 5 == 0) {
        count++;
      }
    }

    return count;
  }

  public String returnMultiplesOf5Between1And500() {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 1; i < 500; i++) {
      if (i % 5 == 0) {
        if (i == 495) {
          stringBuilder.append(i);
        } else {
          stringBuilder.append(i).append(",");
        }
      }
    }

    return stringBuilder.toString();
  }
}
