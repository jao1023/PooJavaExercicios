package aprendendo.poo.heranca.Test01;

public class Uchiha extends Ninja {
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void ShariganAtivado(){
        System.out.println("Meu nome é " + nome + ". O sharigan foi ativado e eu sou um Uchiha");
    }
}
