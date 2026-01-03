package aprendendo.poo.finalKeyWord;

public class Person {

    private final String name;
    private final String cpf;
    private final String dateOfBirth;

    public Person(String name, String cpf, String dateOfBirth){
        this.cpf = cpf;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public void displayInformation(){
        System.out.println("NAME: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("DATE OF BIRTH: " + dateOfBirth);
    }

    public String getName(){
        return name;
    }

    public String getCpf(){
        return cpf;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

}
