package aprendendo.poo.javaAcessModifiers.exercicio1;

public class Pessoa {
    //Variavies privadas
    private String name;
    private int age;
    private String cpf;
    //Getters and Setters para acesso das variaveis
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getCpf(){
        return cpf;
    }
    //Construtor para o objeto
    public Pessoa(String name,String cpf, int age){
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }
//Função para mostrar os dados
    public void exibirDados(){
        System.out.println("NAME: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("AGE: " + age);
    }
}


