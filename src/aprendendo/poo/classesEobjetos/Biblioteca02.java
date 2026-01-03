package aprendendo.poo.classesEobjetos;

public class Biblioteca02 {

    String titulo;
    String autor;
    int numeroPaginas;
    int anoPublicacao;

    Biblioteca02(String titulo,String autor, int numeroPaginas, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    void exibirInformacoes(){
        System.out.println("TITULO: " + titulo);
        System.out.println("AUTOR: " + autor);
        System.out.println("NUM PAGINAS: " + numeroPaginas);
        System.out.println("ANO DE PUBLICAÇÃO" + anoPublicacao);

    }
}
