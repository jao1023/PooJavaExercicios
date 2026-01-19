package aprendendo.projetoSistemaDeRH.hr;

public abstract class Employee {

    //Basics variables for employee.
    private String employeeName;
    private final int employeeId;
    private String employeeMail;
    private static int idCounter;

    //Static initializer for idCounter
    static {
        idCounter = 0;
    }
    //Block will be executed every time we have a new object, adding one to idCounter
    {
        idCounter += 1;
    }

   //Employe basic constructor.
   public Employee(String employeeName ,String employeeMail){
       this.employeeId = idCounter;
       if(employeeName.isEmpty()) {
           System.out.println("Name can't be empty");
           return;
       }
       if(employeeMail.isEmpty()) {
           System.out.println("Mail can't be empty");
           return;
       }
       this.employeeName = employeeName;
       this.employeeMail = employeeMail;
   }
   //Getters for acess the values of variables, because the variables are private.
    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeMail() {
        return employeeMail;
    }

    //abstract method for calculate the salary
    public abstract double calculateSalary();

    public abstract String getBenefits();

    public void displayData(){
        System.out.println("NAME: " + getEmployeeName());
        System.out.println("ID: " + getEmployeeId());
        System.out.println("MAIL " + getEmployeeMail());
        System.out.println("SALARY " + calculateSalary());
    };
}
