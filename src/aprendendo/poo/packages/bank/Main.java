package aprendendo.poo.packages.bank;

import aprendendo.poo.packages.bank.model.Account;
import aprendendo.poo.packages.bank.model.Holder;

import aprendendo.poo.packages.bank.service.Services;
import static aprendendo.poo.packages.bank.service.Services.deposit;
import static aprendendo.poo.packages.bank.service.Services.withDraw;
import static aprendendo.poo.packages.bank.service.Services.transaction;


public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder("Joao","12345678910");
        Holder holder1 = new Holder("Test", "10987654321");

        Account account = new Account(holder, holder.getName(), "1234-5",350.00,holder.getCpf());
        Account account1 = new Account(holder1, holder1.getName(), "5432-1",250.00,holder1.getCpf());

        deposit(account, 1000);
        deposit(account1, 500);

        withDraw(account, 1000);

        transaction(account,account1,30);
    }
}
