package com.ejerciciossimples.progii.tsp;

/**
 * Hacer​ ​ un​ ​ programa​ ​ que​ ​ imprima​ ​ los​ ​ números​ ​ pares​ ​ entre​ ​ el​ ​ 0 ​ ​ al​ ​ 100
 */

public class Ejercicio4 {

    public String returnEvenNumbersBetween0and100() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 == 0 && i != 0) {
                if (i != 100) {
                    stringBuilder.append(i).append(",");
                } else {
                    stringBuilder.append(i);
                }
            }
        }

        return stringBuilder.toString();
    }
}