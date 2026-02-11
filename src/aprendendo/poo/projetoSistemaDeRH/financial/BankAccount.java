package aprendendo.poo.projetoSistemaDeRH.financial;

public class BankAccount {
    private static Transaction[] transactions = new Transaction[100];
    private static double balance;
        //Getter for the balance
    public static double getBalance(){
        return balance;
    }
    //Deposit method, add the value and generate one Transaction extract, if don't have transaction extract null for put the extract reach the max of transactions
    public static void deposit(double value, String description){
        for(int i = 0; i < transactions.length; i++ ){
            if(transactions[i] == null){
                 transactions[i] = new Transaction(value,TransactionType.ENTER,description);
                 balance += value;
                 return;
            }
        }
        throw new IllegalArgumentException("Max transactions reached");
    }
    //Payment method, get the departament salary, check if have balance for pay and pay active the withdraw method
    public static void payDepartmentSalary(Departament departament){
        double departamentSalary = departament.calculateDepartamentSalary();
        if(departamentSalary <= balance){
            System.out.println("Successfully Paid");
            withdraw(departamentSalary,"Pay salary for departament: " + departament);
        }else{
            System.out.println("No enough money for pay the departament");
        }
    }
    //withdraw method, remove the value and generate one Transaction extract, if don't have transaction extract null for put the extract reach the max of transactions
    public static void withdraw(double value, String description){
        for(int i = 0; i < transactions.length; i++ ){
            if(transactions[i] == null){
                transactions[i] = new Transaction(value,TransactionType.EXIT,description);
                balance -= value;
                return;
            }
        }
        throw new IllegalArgumentException("Max transactions reached");
    }
    //Method for display all the transactions
    public static void displayTransactions() {
        for(Transaction t : transactions){
            if(t != null){
                System.out.println(t);
            }
        }
    }


    public String toString(){
        return "BALANCE: " + balance;
    }
}
