/*
 * Copyright (c) 2019 Arcangel Andres Artigue.
 * All rights reserved.
 */

package com.ejerciciossimples.progii.tsp;

public class Ejercicio1 {

    public String returnNumbersFrom0to100() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 100 ; i++) {
            if (i != 100) {
                stringBuilder.append(i).append(",");
            } else {
                stringBuilder.append(i);
            }
        }

        return stringBuilder.toString();
    }
}
