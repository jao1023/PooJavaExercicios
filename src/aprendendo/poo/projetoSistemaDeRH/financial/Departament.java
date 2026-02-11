package aprendendo.poo.projetoSistemaDeRH.financial;

import aprendendo.poo.projetoSistemaDeRH.hr.Employee;

public class Departament {
    private String departamentName;
    private Employee departamentResponsable;
    private double departamentBudget;
    private Employee[] departamentTeam = new Employee[50];
    private static final int MAX_EMPLOYEE = 50;
    private int currentEmployee = 0;

    public Departament(String departamentName, double departamentBudget){
        this.departamentName = departamentName;
        this.departamentBudget = departamentBudget;
    }

    public String getDepartamentName(){
        return departamentName;
    }
    //Method for add a responsable for the departament
    public void addDepartamentResponsable(Employee departamentResponsable){
        this.departamentResponsable = departamentResponsable;
    }
    //Method for add a employee for the departament
    public void addEmployee(Employee employee){
        if(employee == null){
            throw new IllegalArgumentException("Employee can't be null");
        }
        for(int i = 0; i < departamentTeam.length; i++){
            if(employee == departamentTeam[i]){
                throw new IllegalArgumentException("this function is already on the team ");
            }
        }
        for(int i = 0; i < departamentTeam.length; i++){
            if(departamentTeam[i] == null){
                departamentTeam[i] = employee;
                currentEmployee++;
                return;
            }
        }
        throw new IllegalStateException("Max team members reached");
    }
    //Method for rem the emplooye from departament
    public void remEmployee(Employee employee){
        if(employee == null){
            throw new IllegalArgumentException("Employee can't be null");
        }

        for(int i = 0; i < departamentTeam.length; i++){
            if(departamentTeam[i] != null && departamentTeam[i].getEmployeeId() == employee.getEmployeeId()){
                departamentTeam[i] = null;
                currentEmployee--;
                return;
            }
        }
        throw new IllegalStateException("this function is not on the team");
    }
    //Method for calculate the departament the salary
    public double calculateDepartamentSalary(){
        double departamentPayment = 0;
        for(Employee e: departamentTeam){
            if(e != null){
         departamentPayment += e.calculateSalary();
            }
        }
        return departamentPayment;
    }
//Method for display the team employees
    public void displayEmployees() {
        for(Employee e: departamentTeam){
            if(e != null){
                System.out.println(e);
            }
        }
    }
//To string for display the information
    public String toString(){
        return "[DEPARTAMENT NAME: " + departamentName + "]" + "[DEPARTAMENT RESPONSABLE: " + departamentResponsable + "]" + "[DEPARTAMENT PAYMENT: " + calculateDepartamentSalary() + "]" + "[CURRENT DEPARTAMENT MEMBERS: " + currentEmployee + "]";
    }
}
