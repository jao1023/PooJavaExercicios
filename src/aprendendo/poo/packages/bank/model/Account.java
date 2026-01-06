package aprendendo.poo.packages.bank.model;

public class Account {

    private final String name;
    private final String accountNumber;
    private double balance = 0;
    private String cpf;

    public Account(Holder holder, String name, String accountNumber, double balance,String cpf){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = holder.getName();
        this.cpf = holder.getCpf();
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        if(amount > 0) {
            balance = amount;
        }else {
            System.out.println("Invalid Amount");
        }
    }

    public String getCpf(){
        return cpf;
    }

}
