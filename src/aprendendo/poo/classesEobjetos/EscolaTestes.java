package aprendendo.poo.classesEobjetos;

public class EscolaTestes {
    public static void main(String[] args) {
        AlunoFuncoes aluno = new AlunoFuncoes("Jose", 1000);

        aluno.adicionarNotas(1);
        aluno.adicionarNotas(1);
        aluno.adicionarNotas(1);

        aluno.calcularMedia();

        aluno.verificarAprovacao();
    }
}
