package aprendendo.poo.classesEobjetos;

public class BancoTeste {

    public static void main(String[] args) {
        BancoFuncoes cliente1 = new BancoFuncoes("João Victor",1234);

        cliente1.consultarSaldo();
        cliente1.depositar(3000.0);
        cliente1.consultarSaldo();
        cliente1.sacar(4000);
        cliente1.sacar(1500);
        cliente1.consultarSaldo();
    }
}
