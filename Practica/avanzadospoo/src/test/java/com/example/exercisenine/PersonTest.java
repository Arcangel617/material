package com.example.exercisenine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

  private Person person;
  private String personName = "personName";
  private String personAddress = "personAddress";

  @BeforeEach
  void setup() {
    person = new Person(personName, personAddress);
  }

  @Test
  void shouldBuildaPersonObject() {
    String expected = "Person[name=" + personName + ",address=" + personAddress + "]";
    assertEquals(expected, person.toString());
  }

  @Test
  void shouldReturnPersonName() {
    assertEquals(personName, person.getName());
  }

  @Test
  void shouldReturnPersonAddress() {
    String personAddress = "newPersonAddress";
    person.setAddress(personAddress);
    assertEquals(personAddress, person.getAddress());
  }

}