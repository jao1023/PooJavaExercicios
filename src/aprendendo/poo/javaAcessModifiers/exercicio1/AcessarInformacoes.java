package aprendendo.poo.javaAcessModifiers.exercicio1;

public class AcessarInformacoes {
    public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Joao","133.706.319-38",17);
       p1.exibirDados();
       p1.setAge(18);
       p1.setName("Joaozinho");
       p1.exibirDados();
    }
}
