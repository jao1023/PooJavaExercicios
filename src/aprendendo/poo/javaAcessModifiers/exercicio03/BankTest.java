package aprendendo.poo.javaAcessModifiers.exercicio03;

public class BankTest {

    public static void main(String[] args) {
        BankAccount person01 = new BankAccount("João",321);

        person01.consultBalance();
        person01.deposit(1000);
        person01.consultBalance();
        person01.withdraw(10000);
        person01.withdraw(100);
        person01.consultBalance();
    }


}
