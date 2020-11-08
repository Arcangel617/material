package com.tsp.example.domain;

public class Client {

  // Atributos

  private String name;
  private String lastName;

  // Propiedades

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // Metodos

  private String createFullName() {
    return getLastName() + ", " + getName();
  }

  public void printFullName() {
    System.out.println(createFullName());
  }
}
