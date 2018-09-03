/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisefour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;
    private String accountId = "99999";
    private String accountName = "accountName";
    private int accountBalance = 100000;

    @Before
    public void setup() {
        account = new Account(accountId,accountName,accountBalance);
    }

    @Test
    public void shouldBuildAnAccountObject() {
        String expected = "Account[id=" + accountId + ",name=" + accountName + ",balance=0]";
        account = new Account(accountId,accountName);
        assertEquals(expected,account.toString());
    }

    @Test
    public void shouldBuildAnAccountObjectWithBalance() {
        String expected = "Account[id=" + accountId + ",name=" + accountName + ",balance=" + accountBalance + "]";
        assertEquals(expected,account.toString());
    }

    @Test
    public void shouldReturnAccountId() {
        assertEquals(accountId,account.getId());
    }

    @Test
    public void shouldReturnAccountName() {
        assertEquals(accountName,account.getName());
    }

    @Test
    public void shouldReturnAccountBalance() {
        assertEquals(accountBalance,account.getBalance());
    }

    @Test
    public void shouldCreditAmount() {
        int amount = 1000;
        assertEquals(accountBalance,account.getBalance());
        account.credit(amount);
        assertEquals(accountBalance+amount,account.getBalance());
    }

    @Test
    public void shouldDebitAmount() {
        int amount = 1000;
        assertEquals(accountBalance,account.getBalance());
        account.debit(amount);
        assertEquals(accountBalance-amount,account.getBalance());
    }

    @Test
    public void shouldTransferAmountToAnotherAccount() {
        int amount = 1000;
        Account anotherAccount = new Account("888888","anotherAccount");
        assertEquals(accountBalance,account.getBalance());
        account.transferTo(anotherAccount,amount);
        assertEquals(accountBalance-amount,account.getBalance());
        assertEquals(amount,anotherAccount.getBalance());
    }
}