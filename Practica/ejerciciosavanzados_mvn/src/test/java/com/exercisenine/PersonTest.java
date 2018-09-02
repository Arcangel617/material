/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisenine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;
    private String personName = "personName";
    private String personAddress = "personAddress";

    @Before
    public void setup() {
        person = new Person(personName, personAddress);
    }

    @Test
    public void shouldBuildaPersonObject() {
        String expected = "Person[name=" + personName + ",address=" + personAddress + "]";
        assertEquals(expected, person.toString());
    }

    @Test
    public void shouldReturnPersonName() {
        assertEquals(personName, person.getName());
    }

    @Test
    public void shouldReturnPersonAddress() {
        String personAddress = "newPersonAddress";
        person.setAddress(personAddress);
        assertEquals(personAddress, person.getAddress());
    }

}