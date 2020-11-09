package com.example.exercisefour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

    private Account account;
    private String accountId = "99999";
    private String accountName = "accountName";
    private int accountBalance = 100000;

    @BeforeEach
    void setup() {
        account = new Account(accountId,accountName,accountBalance);
    }

    @Test
    void shouldBuildAnAccountObject() {
        String expected = "Account[id=" + accountId + ",name=" + accountName + ",balance=0]";
        account = new Account(accountId,accountName);
        assertEquals(expected,account.toString());
    }

    @Test
    void shouldBuildAnAccountObjectWithBalance() {
        String expected = "Account[id=" + accountId + ",name=" + accountName + ",balance=" + accountBalance + "]";
        assertEquals(expected,account.toString());
    }

    @Test
    void shouldReturnAccountId() {
        assertEquals(accountId,account.getId());
    }

    @Test
    void shouldReturnAccountName() {
        assertEquals(accountName,account.getName());
    }

    @Test
    void shouldReturnAccountBalance() {
        assertEquals(accountBalance,account.getBalance());
    }

    @Test
    void shouldCreditAmount() {
        int amount = 1000;
        assertEquals(accountBalance,account.getBalance());
        account.credit(amount);
        assertEquals(accountBalance+amount,account.getBalance());
    }

    @Test
    void shouldDebitAmount() {
        int amount = 1000;
        assertEquals(accountBalance,account.getBalance());
        account.debit(amount);
        assertEquals(accountBalance-amount,account.getBalance());
    }

    @Test
    void shouldTransferAmountToAnotherAccount() {
        int amount = 1000;
        Account anotherAccount = new Account("888888","anotherAccount");
        assertEquals(accountBalance,account.getBalance());
        account.transferTo(anotherAccount,amount);
        assertEquals(accountBalance-amount,account.getBalance());
        assertEquals(amount,anotherAccount.getBalance());
    }
}