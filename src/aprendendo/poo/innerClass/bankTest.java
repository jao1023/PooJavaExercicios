package aprendendo.poo.innerClass;

import aprendendo.poo.javaAcessModifiers.exercicio03.BankAccount;

public class bankTest {

    public static void main(String[] args) {
       bank.bankAccount acc = new bank.bankAccount("João","1234",1000);
       acc.deposit(-5);
       acc.balanceConsult();
       acc.withdraw(2500);
       acc.balanceConsult();
    }
}
