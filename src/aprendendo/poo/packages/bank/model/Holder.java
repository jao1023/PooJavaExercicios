package aprendendo.poo.packages.bank.model;

public class Holder {

    private final String name;
    private final String cpf;

    public Holder(String name, String cpf){
        this.cpf = cpf;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getCpf(){
        return cpf;
    }
}
