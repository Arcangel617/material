/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisenine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Student("Arcangel", "Corrientes", "Programming II", 2016 ,600));
        people.add(new Student("Mariano", "Resistencia", "Programming II", 2015 ,600));
        people.add(new Staff("UEP53", 2000, "Facundo", "Resistencia"));

        for (Person person : people) {
            System.out.println(person);
        }
    }

}