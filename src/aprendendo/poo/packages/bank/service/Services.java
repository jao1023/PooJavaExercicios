package aprendendo.poo.packages.bank.service;

import aprendendo.poo.packages.bank.model.Account;

public class Services {

    public static void deposit(Account account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Sucess");
        } else {
            System.out.println("Amount has to be greater than 0");
        }
    }

    public static void withDraw(Account account, double amount) {
        if (account.getBalance() >= amount && amount > 0) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Sucess");
        } else {
            System.out.println("Amount has to be greater than 0 and value must be positive");
        }
    }

    public static void transaction(Account account, Account account2, double amount) {
        if (!account.getCpf().equals(account2.getCpf())) {
            if (account.getBalance() >= amount) {
                account2.setBalance(account2.getBalance() + amount);
                account.setBalance(account.getBalance() - amount);
                System.out.println("Sucess");
            } else {
                System.out.println("Invalid Amount");
            }
        }else{
            System.out.println("You cant do a transaction for your account");
        }
    }
    }

