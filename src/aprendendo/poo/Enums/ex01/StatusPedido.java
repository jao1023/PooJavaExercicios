package aprendendo.poo.Enums.ex01;

public enum StatusPedido  {

    PENDENTE{
        @Override
        public StatusPedido proximoStatus(){
            return PROCESSAMENTO;
        }
        @Override
        public boolean podeSerCancelado(){
            return true;
        }
    },

    PROCESSAMENTO{
        @Override
        public StatusPedido proximoStatus(){

            return ENVIADO;
        }
        @Override
        public boolean podeSerCancelado(){

            return true;
        }
    },

    ENVIADO{
        @Override
        public StatusPedido proximoStatus(){

            return ENTREGUE;
        }
        @Override
        public boolean podeSerCancelado(){
            return false;
        }
    },

    ENTREGUE{
        @Override
        public StatusPedido proximoStatus(){

            return ENTREGUE;
        }
        @Override
        public boolean podeSerCancelado(){

            return false;
        }
    },
    CANCELADO{
        @Override
        public StatusPedido proximoStatus(){

            return CANCELADO;
        }
        @Override
        public boolean podeSerCancelado(){

            return false;
        }
    };



    public abstract StatusPedido proximoStatus();
    public abstract boolean podeSerCancelado();
}
