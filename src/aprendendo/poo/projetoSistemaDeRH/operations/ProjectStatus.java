package aprendendo.poo.projetoSistemaDeRH.operations;

public enum ProjectStatus {

    IN_PLANING{
        @Override
        public ProjectStatus nextStatus(){
          return ProjectStatus.IN_PROGRESS;
        };
        @Override
        public boolean canCancel(){
            return true;
        };
    },
    IN_PROGRESS{
        @Override
        public ProjectStatus nextStatus(){
            return ProjectStatus.FINISHED;
        };
        @Override
        public boolean canCancel(){
            return true;
        };
    },
    FINISHED{
        @Override
        public ProjectStatus nextStatus(){
            return ProjectStatus.FINISHED;
        };
        @Override
        public boolean canCancel(){
            return false;
        };
    },
    CANCELED{
        @Override
        public ProjectStatus nextStatus(){
            return ProjectStatus.CANCELED;
        };
        @Override
        public boolean canCancel(){
            return true;
        };
    };

    public abstract ProjectStatus nextStatus();
    public abstract boolean canCancel();
}
