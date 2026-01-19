package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.EnabledForExtraHours;

public class HourlyEmployee extends Employee implements EnabledForExtraHours {
    //Variables for calculate the salary of Hourly Employee
    private double workedHours;
    private double hourValue;

    //Constructor
    public HourlyEmployee(String employeeName, String employeeMail , double workedHours, double hourValue) {
        super(employeeName, employeeMail);
        this.workedHours = workedHours;
        this.hourValue = hourValue;
    }

    //Method for calculate employee salary
    @Override
    public double calculateSalary() {
        if(workedHours <= 0 ){
            System.out.println("Employee has to be fired");
        }

        return workedHours * hourValue;
    }
    @Override
    public String getBenefits(){
        return "";
    };


}
