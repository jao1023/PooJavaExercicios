package aprendendo.poo.objectLifeCycle;
public class objectLife {
    private String nome;



    // CONSTRUTOR - Executado na CRIAÇÃO
    public  objectLife(String nome) {
        this.nome = nome;
        System.out.println("🐕 " + nome + " nasceu!");
    }

    // Método usado durante a VIDA do objeto
    public void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    // FINALIZADOR - Executado antes da DESTRUIÇÃO (raramente usado)
    @Override
    protected void finalize() {
        System.out.println("💀 " + nome + " não existe mais...");
    }
}

