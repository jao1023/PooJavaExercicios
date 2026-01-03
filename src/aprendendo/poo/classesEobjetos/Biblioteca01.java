package aprendendo.poo.classesEobjetos;

public class Biblioteca01 {
    public static void main(String[] args) {
        Biblioteca02 b = new Biblioteca02("O segredo da mente milionaria","T. Harv Eker",200, 2006);
        Biblioteca02 b2 = new Biblioteca02("O segredo da mente milionaria","T. Harv Eker",200, 2006);

        b.exibirInformacoes();
    }
}
