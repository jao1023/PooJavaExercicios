package aprendendo.projetoSistemaDeRH.financial;

public class Transaction {
    private double value;
    private int day;
    private TransactionType transactionType;
    private String description;
    //Constructor
    public Transaction(double value, TransactionType transactionType, String description) {
        this.value = value;
        this.day = day;
        this.transactionType = transactionType;
        this.description = description;
    }
    //toString for display the constructor
    public String toString(){
        return "[DAY" + day + "]" +
                "[VALUE" + value + "]" +
                "[TRANSCTION TYPE" + transactionType + "]" +
                "[DESCRIPTION" + description + "]";
    }
}
