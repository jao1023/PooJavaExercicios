package aprendendo.poo.javaAcessModifiers.exercicio03;

public class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;


   public BankAccount(final String holderName,final int accountNumber){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    //Getter for information about account
    public int getAccountNumber(){
       return accountNumber;
    }
    public String getHolderName(){
       return holderName;
    }

    //Function to see the balance
    public double consultBalance(){
       System.out.println("BALANCE: " + balance);
       return balance;
    }
    //Function for deposit with validation for the value
    public void deposit(double value){
       if(value > 0){
           balance += value;
       }else{
           System.out.println("Your value has to be greater than 0");
       }
    }
    //Fucntion for withdraw with validation for balance and value
    public void withdraw(double value){
       if(value > 0 && balance >= value){
           balance -= value;
       }else{
           System.out.println("Your value has to be greater than 0 and your balance has to have the value you try to withdraw");
       }
    }

}
