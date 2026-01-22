package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.Beneficial;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnableForBonus;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnabledForExtraHours;
import aprendendo.projetoSistemaDeRH.hr.interfaces.Promotable;

public class Manager extends Employee implements EnableForBonus, EnabledForExtraHours, Promotable {
    private int level = 2;
    private static final double BASE_SALARY = 3600;
    private static final double EXTRA_HOURS_PERCENTAGE = 1.5;
    private static final double BONUS_PERCENTAGE = 0.1;

    private double bonus = 0.0;
    private double extraHours = 0.0;

    //Getters for the private variables
    public double getBonus() {
        return bonus;
    }

    public double getExtraHours() {
        return extraHours;
    }

    public Manager(String employeeName, String employeeMail) {
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
        return bonus + BASE_SALARY + extraHours ;
    }

    @Override
    public String getEmployeeBenefits() {
        return " FREE TRANSPORT : FREE FOOD : EARNINGS SHARE : 13 SALARY + CLT BENEFITS";
    }

    @Override
    public double calculateTax(){
        return calculateSalary() * 0.15;
    }

    @Override
    public void promote() {
        level++;
    }

}
