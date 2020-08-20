package com.tsp.example.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccountTest {

  @Test
  void getAccountNumber() {
    Account account = new Account(1);
    assertEquals(1, account.getAccountNumber());
  }

  @Test
  void getBalance() {
    Account account = new Account(1);
    assertEquals(0.0, account.getBalance());
  }

  @Test
  void setBalance() {
    Account account = new Account(1);
    account.setBalance(1000);
    assertEquals(1000.0, account.getBalance());
  }

  @Test
  void credit() {
    Account account = new Account(1);
    account.credit(500);
    assertEquals(500.0, account.getBalance());
  }

  @Test
  void debit() {
    Account account = new Account(1);
    account.debit(200);
    assertEquals(-200.0, account.getBalance());
  }

  @Test
  void testToString() {
    Account account = new Account(1);
    assertEquals("Account{accountNumber=1, balance=0.0}", account.toString());
  }
}