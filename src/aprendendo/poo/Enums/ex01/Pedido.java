package aprendendo.poo.Enums.ex01;

public class Pedido {

        private StatusPedido status;
        private String descricao;
        private StatusPedido statusAntigo;

        public Pedido(String descricao){
            this.descricao = descricao;
            this.status = StatusPedido.PENDENTE;
        }


        public void avancarStatus(){

            if(status == StatusPedido.CANCELADO){
                System.out.println("Pedido cancelado, não é possível avançar o status");
            }else{
                statusAntigo = status;
                status = status.proximoStatus();
                System.out.println("STATUS AVANÇADO COM SUCESSO, STATUS ATUAL: " + status);
            }


        }

        public boolean cancelar(){
            boolean pedidoCancelado = false;
           if(status.podeSerCancelado() == false) {
               pedidoCancelado = false;
               System.out.println("O pedido não foi cancelado, pois já foi enviado ou entregue");
           }else{
               pedidoCancelado = true;
               status = status.CANCELADO;
               System.out.println("O pedido foi cancelado");

           }
            return pedidoCancelado;
        };
    public void mostrarStatus(){
        System.out.println("STATUS: " + status);
    }
}
