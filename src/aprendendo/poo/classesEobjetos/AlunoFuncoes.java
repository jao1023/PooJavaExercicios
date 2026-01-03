package aprendendo.poo.classesEobjetos;

public class AlunoFuncoes {
    //Variavies usadas no codigo
    String nome;
    int matricula;
    double[] notas;
    double somaNotas = 0;
    double media = 0;

    //Construtor passando nome,matricula e uma array com 3 espacos de nota
    AlunoFuncoes(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[3];
    }
    //Funcao para adicionar as notas
    void adicionarNotas(double nota){
        for(int i = 0; i < notas.length; i++){
            if(notas[i] == 0 ){
                notas[i] = nota;
                break;
            }
        }
    }
    //Funcao para calcular a media
    double calcularMedia(){
        for(int i = 0; i < notas.length; i++){
            somaNotas += notas[i];
        }
        media = somaNotas / 3.0 ;
        System.out.println("MEDIA: "+ media);
        return media;
    }
    //Funcao para verificar o status do aluno
    void verificarAprovacao(){
        if(media >= 7){
            System.out.println("ALUNO: " + nome + " |STATUS: APROVADO");
        }else if(media >= 5){
            System.out.println("ALUNO: " + nome + " |STATUS: RECUPERAÇÃO");
        }else{
            System.out.println("ALUNO: " + nome + " |STATUS: REPROVADO");
        }
    }
}
