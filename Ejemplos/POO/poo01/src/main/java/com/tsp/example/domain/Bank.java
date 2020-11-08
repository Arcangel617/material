package com.tsp.example.domain;

public class Bank {

  // Atributos

  private String name;
  private Account account;

  // Propiedades

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
