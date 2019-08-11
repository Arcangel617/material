package com.ejerciciossimples.progii.tsp;

/**
 * ​ Hacer​ ​ un​ ​ programa​ ​ que​ ​ imprima​ ​ los​ ​ números​ ​ impares​ ​ hasta​ ​ el​ ​ 100​ ​ y ​ ​ que​ ​ imprima​ ​ cuantos​ ​ impares​ ​ hay
 */

public class Ejercicio5 {

    public int countOddNumbersBetween0and100() {
        int count = 0;

		for (int i = 0; i < 100 ; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}

		return count;
    }

    public String returnOddNumbersBetween0and100() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100 ; i++) {
            if (i % 2 != 0 && i != 0) {
                if (i != 99) {
                    stringBuilder.append(i).append(",");
                } else {
                    stringBuilder.append(i);
                }
            }
        }

        return stringBuilder.toString();
    }
}