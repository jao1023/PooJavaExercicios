package aprendendo.poo.classesEobjetos;

public class Pokemon {

    String nome;

    Pokemon(String pName){
        nome = "pikaChu";
    }

     void salario(int HorasTrabalhadas, int ValorHora) {
         System.out.println("value has be paid is for " + nome + ":" + HorasTrabalhadas * ValorHora);
    }
}
