package com.tsp.example.domain;

public class Account {

  // Atributos

  private int accountNumber;
  private double balance = 0.0;
  private Client client;
  private Bank bank;

  // Constructores

  public Account(Bank bank) {
    this.accountNumber = -1;
    this.balance = 1000;
    this.bank = bank;
  }

  public Account(Bank bank, int accountNumber) {
    this.accountNumber = accountNumber;
    this.bank = bank;
  }

  public Account(Bank bank, int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.bank = bank;
  }

  // Propiedades

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  // Metodos

  public void credit(double amount) {
    this.balance += amount;
  }

  public void debit(double amount) {
    this.balance -= amount;
  }

  @Override
  public String toString() {
    return "Account{" +
        "accountNumber=" + accountNumber +
        ", balance=" + balance +
        '}';
  }
}
