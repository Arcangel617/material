package com.tsp.example.domain;

public class Account {

  private int accountNumber;
  private double balance = 0.0;

  public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public Account(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

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
