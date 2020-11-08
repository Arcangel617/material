package com.tsp.example.domain;

public abstract class Persona {

  private final String nombre;
  private final String edad;

  public Persona(String nombre, String edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public Persona() {
    this.nombre = "";
    this.edad = "";
  }

  public String getNombre() {
    return nombre;
  }

  public String getEdad() {
    return edad;
  }

  public abstract String mostrar();

}
