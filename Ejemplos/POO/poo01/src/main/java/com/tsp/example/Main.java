package com.tsp.example;

import com.tsp.example.domain.Account;

public class Main {

  public static void main(String[] args) {

    Account acc = new Account(1);

    acc.setBalance(1000.50);

    double d = acc.getBalance();

    System.out.println(acc.getAccountNumber());
    System.out.println(d);

    acc.credit(500);

    d = acc.getBalance();

    System.out.println(d);
  }

}
