package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.Beneficial;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnableForBonus;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnabledForExtraHours;

public class MonthlyEmployee extends Employee implements EnableForBonus, EnabledForExtraHours{
    private static final double BASE_SALARY = 1600;
    private static final double EXTRA_HOURS_PERCENTAGE = 1.2;
    private static final double BONUS_PERCENTAGE = 0.05;
    private double bonus = 0.0;
    private double extraHours = 0.0;
    //Getters for the private variables
    public double getBonus() {
        return bonus;
    }

    public double getExtraHours() {
        return extraHours;
    }

    public MonthlyEmployee(String employeeName, String employeeMail) {
        super(employeeName, employeeMail);
    }

    @Override
    public double calculateExtra(double extraHours,double hourlyRate){
        this.extraHours = extraHours * hourlyRate * EXTRA_HOURS_PERCENTAGE;
        return this.extraHours ;
    };

    @Override
    public void calculateBonus(double valueInsales){
        bonus = valueInsales * BONUS_PERCENTAGE;
    };
    @Override
    public double calculateSalary() {
        return bonus + BASE_SALARY;
    }
    @Override
    public String getEmployeeBenefits() {
        return " FREE TRANSPORT : FREE FOOD : 13 SALARY + CLT BENEFITS";
    }
}
