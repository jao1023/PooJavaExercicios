package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.Beneficial;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnabledForExtraHours;

public class HourlyEmployee extends Employee  {
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
        return workedHours * hourValue;
    }

    @Override
    public String getEmployeeBenefits() {
        return " FREE TRANSPORT : FREE FOOD";
    }


}
