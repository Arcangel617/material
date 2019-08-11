package com.ejerciciossimples.progii.tsp;

/**
 * Hacer​ ​ un​ ​ programa​ ​ que​ ​ imprima​ ​ los​ ​ números​ ​ del​ ​ 100​ ​ al​ ​ 0 ​ ​ en​ ​ orden​ ​ decreciente
 */

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