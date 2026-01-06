package aprendendo.poo.innerClass;

public class bank {

   private static final String bankName = "Banco Nacional";

    public static void displayBankName(){
        System.out.println("Bank Name: " + bankName);
    };

    public static class bankAccount{
        private final String holderName;
        private final String accountNumber;
        private double balance;
        private final String currentBank;


        bankAccount(String holderName, String accountNumber, double balance){
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.holderName = holderName;
            this.currentBank = bankName;
        }

        public void deposit(double amount){
         if(amount <= 0){
             System.out.println("The amount for deposit has to be greater than 0");
         }else{
             balance += amount;
         }
        }

        public void withdraw(double amount){
            if(amount <= balance && amount >= 0){
                balance -= amount;
            }else{
                System.out.println("The amount is greather than your balance or you try to withdraw a invalid amount");
            }
        }
        public double balanceConsult(){
            System.out.println("Balance: " + balance);
            return  balance;
        }


    }
}
