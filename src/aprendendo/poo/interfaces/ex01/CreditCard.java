package aprendendo.poo.interfaces.ex01;

public class CreditCard implements Payment{
   private double cardLimit;
   private final String cardNumber;
   private boolean paymentProcess;

   public CreditCard(double cardLimit,String cardNumber){
       this.cardLimit = cardLimit;
       this.cardNumber = cardNumber;
   }

   public double getCardLimit(){
       return cardLimit;
   }
   public void setCardLimit(double newLimit){
       cardLimit = newLimit;
   }

   public String getCardNumber(){
       return cardNumber;
   }



    @Override
    public void ProcessPayment(double value) {
       if(cardNumber.isEmpty()){
           System.out.println("Card number is empty");
       }

        System.out.println("PROCESSING PAYMENT!");
        System.out.println("PAYMENT VALUE " + value);
        System.out.println("PAYMENT METHOD: CARD ");
        if(cardLimit >= value){
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
