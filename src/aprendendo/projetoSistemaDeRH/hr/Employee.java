package aprendendo.projetoSistemaDeRH.hr;

public abstract class Employee {

   //Basics variables for employee.
   private final String employeeName;
   private final int employeeId;
   private String employeeMail;

   //Employe basic constructor.
   public Employee(String employeeName ,int employeeId ,String employeeMail){
       this.employeeName = employeeName;
       this.employeeId = employeeId;
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
}
