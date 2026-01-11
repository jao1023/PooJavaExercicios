package aprendendo.poo.interfaces.ex01;

public class Pix implements Payment{
    private String pixKey;
    private double accountBalance;
    private boolean paymentProcess;

    public Pix(String pixKey, double accountBalance){
        this.pixKey = pixKey;
        this.accountBalance = accountBalance;
    }

    public String getPixKey(){
        return pixKey;
    }
    public double getAccountBalance(){
        return accountBalance;
    }

    @Override
    public void ProcessPayment(double value) {
        if(pixKey.isEmpty()){
            System.out.println("Pix key invalid or not informed");
        }
        System.out.println("PROCESSING PAYMENT!");
        System.out.println("PAYMENT VALUE " + value);
        System.out.println("PAYMENT METHOD: PIX ");

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
