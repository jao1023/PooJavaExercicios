package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.Beneficial;
import aprendendo.projetoSistemaDeRH.hr.interfaces.Taxable;

public abstract class Employee implements Beneficial, Taxable {
    //Basics variables for employee.
    private String employeeName;
    private final int employeeId;
    private String employeeMail;
    private static int idCounter = 1;

    //Static initializer for idCounter

   //Employe basic constructor.
   public Employee(String employeeName ,String employeeMail){
       //Verify for name and mail, because this information can't be null, has to have a value
       if(employeeName == null || employeeName.isBlank()) {
           throw new IllegalArgumentException("The name can't be null");
       }
       if(employeeMail == null || employeeMail.isBlank()) {
           throw new IllegalArgumentException("The mail can't be null");
       }
           this.employeeId = idCounter++;
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

   //Main method for calculate the tax of the employer
    public double calculateTax(){
        return 0.0;
    }
    //Public toString for see the values
    public String toString(){
        return "[NAME = " + getEmployeeName() + "] " +
               "[ID = " +getEmployeeId() + "]" +
                "[MAIL = " +getEmployeeMail() + "]" +
        "[SALARY = " +calculateSalary() + "]";

    };
}
