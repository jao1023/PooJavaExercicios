package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.Beneficial;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnableForBonus;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnabledForExtraHours;

public class Manager extends Employee implements EnableForBonus, EnabledForExtraHours,Beneficial {
    private static final double BASE_SALARY = 3600;
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
        this.extraHours = extraHours * hourlyRate * 1.5;
        return this.extraHours ;
    };

    @Override
    public void calculateBonus(double valueInsales){
        bonus = valueInsales * 0.1;
    };
    @Override
    public double calculateSalary() {
        return bonus + BASE_SALARY + extraHours ;
    }

    @Override
    public String getEmplooyeBenefits() {
        return " FREE TRANSPORT : FREE FOOD : EARNINGS SHARE : 13 SALARY + CLT BENEFITS";
    }

}
