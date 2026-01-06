package aprendendo.poo.packages.shop.model;

public class Customer {

    private final String NAME;
    private final String CPF;
    private String email;

    public Customer(String NAME, String CPF,String email){
        this.NAME = NAME;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNAME(){
        return NAME;
    }
    public String getCPF(){
        return CPF;
    }
    public String getEmail(){
        return email;
    }
    public void displayInfo(){
        System.out.println("NAME: " + NAME);
        System.out.println("CPF: " + CPF);
        System.out.println("EMAIL: " + email);
    }

}
