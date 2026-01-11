package aprendendo.poo.interfaces.ex01;

public class Main {
    public static void main(String[] args) {
       // CreditCard c = new CreditCard(3000,"1234");
       // c.ProcessPayment(30000);
       // c.validatePayment();

      //  Pix p = new Pix("342455",4000);
       // p.ProcessPayment(3500);
      //  p.validatePayment();

        Ticket t = new Ticket("123445",30000);
        t.ProcessPayment(30000.01);
        t.validatePayment();
    }
}
