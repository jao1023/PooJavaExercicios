package aprendendo.poo.interfaces.ex01;

public class Ticket implements Payment{
   private String barCode;
   private double accountBalance;
   private boolean paymentProcess;

   public Ticket(String barCode,double accountBalance){
       this.barCode = barCode;
       this.accountBalance = accountBalance;
   }

   public String getBarCode(){
       return barCode;
   }

   private double getAccountBalance(){
       return accountBalance;
   }


    @Override
    public void ProcessPayment(double value) {
        if(barCode.isEmpty()){
            System.out.println("Bar code invalid or not informed");
        }
        System.out.println("PROCESSING PAYMENT!");
        System.out.println("PAYMENT VALUE " + value);
        System.out.println("PAYMENT METHOD: TICKET ");

        if(accountBalance >= value){
            paymentProcess = true;
        }else{
            paymentProcess = false;
        }
    }

    @Override
    public void validatePayment() {
        if(paymentProcess == true){
            System.out.println("PAYMENT APPROVED");
        }else{
            System.out.println("PAYMENT RECUSED");
        }
    }
}
