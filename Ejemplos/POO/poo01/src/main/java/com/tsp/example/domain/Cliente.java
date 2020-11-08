package com.tsp.example.domain;

public class Cliente extends Persona {

  private final String telefonoDeContacto;

  public Cliente(String nombre, String edad, String telefonoDeContacto) {
    super(nombre, edad);
    this.telefonoDeContacto = telefonoDeContacto;
  }

  public String getTelefonoDeContacto() {
    return telefonoDeContacto;
  }

  @Override
  public String mostrar() {
    return "[" + super.getNombre() + ", " + super.getEdad() + ", " + telefonoDeContacto;
  }
}
