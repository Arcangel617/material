package com.tsp.example;

import com.tsp.example.domain.Account;
import com.tsp.example.domain.Bank;
import com.tsp.example.domain.Client;

public class Main {

  public static void main(String[] args) {

    Account account = new Account(999);

    Client client = new Client();
    client.setName("Juan");
    client.setLastName("Perez");

    // Asocio Account con Client
    account.setClient(client);
    account.getClient().setLastName("Gomez");

    // Asocio Bank con Account
    Bank bank = new Bank();
    bank.setName("Macro");
    bank.setAccount(account);

    System.out.println(client.getLastName());

    System.out.println(account.getClient().getLastName());

    account.getClient().printFullName();

  }

}
