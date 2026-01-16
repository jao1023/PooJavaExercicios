package aprendendo.poo.Enums.ex01;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Produto");

        pedido.mostrarStatus();
        pedido.avancarStatus();
        pedido.avancarStatus();
        pedido.avancarStatus();
        pedido.cancelar();

    }
}
