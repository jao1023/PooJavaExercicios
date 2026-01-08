package aprendendo.poo.objectLifeCycle;

public class main {

        public static void main(String[] args) {
            // FASE 1: CRIAÇÃO
            objectLife rex = new objectLife("Rex");

            // FASE 2: USO
            rex.latir();
            rex.latir();

            // FASE 3: DESTRUIÇÃO
            rex = null; // Remove a referência
            System.gc(); // Sugere ao Java limpar a memória

            // Rex será destruído pelo Garbage Collector
        }
    }
