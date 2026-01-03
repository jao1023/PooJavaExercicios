package aprendendo.poo.classesEobjetos;

public class BancoFuncoes {
    //Inicializa as variaves usadas
    int numeroConta;
    String nomeTitular;
    double saldo;

    //Construtor do objeto
    BancoFuncoes(String nomeTitular, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    //Função para deposito, adicionando o valor informado a conta
    void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Deposito realizado com sucesso");
    }
    //Função para saque, removendo o valor informado da conta
    void sacar(double valor){
        //Verificação se o saldo possui o valor para o saque
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            saldo = saldo - valor;
            System.out.println("Saque Realizado com sucesso");
        }
    }
    //Consulta o saldo
    void consultarSaldo(){
        System.out.println("NUMCONTA: " + numeroConta + " SALDO DA CONTA: " + saldo);
    }
}
