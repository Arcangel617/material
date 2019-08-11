package com.ejerciciossimples.progii.tsp;

/**
 * ​ ​Hacer​ ​ un​ ​ programa​ ​ que​ ​ imprima​ ​ los​ ​ números​ ​ del​ ​ 0 ​ ​ al​ ​ 100
 */

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
