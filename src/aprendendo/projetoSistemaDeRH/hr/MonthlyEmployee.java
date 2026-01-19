package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.EnableForBonus;
import aprendendo.projetoSistemaDeRH.hr.interfaces.EnabledForExtraHours;

public class MonthlyEmployee extends Employee implements EnableForBonus, EnabledForExtraHours {
    private double BASE_SALARY = 1600;
    private double bonus = 0.0;

    public MonthlyEmployee(String employeeName, String employeeMail) {
        super(employeeName, employeeMail);

    }
    @Override
    public void calculateBonus(double valueInsales){
        bonus = valueInsales * 0.05;
    };
    @Override
    public double calculateSalary() {
        return bonus + BASE_SALARY;
    }
    @Override
    public String getBenefits(){
        return "";
    };
}
