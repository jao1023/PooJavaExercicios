package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.EnableForBonus;

public class MonthlyEmployee extends Employee implements EnableForBonus {
    private double BASE_SALARY = 1600;
    private double bonus = 0.0;

    public MonthlyEmployee(String employeeName,int employeeId, String employeeMail, double bonus) {
        super(employeeName, employeeId, employeeMail);

    }
    @Override
    public void calculateBonus(double valueInsales){
        bonus = valueInsales * 0.05;
    };
    @Override
    public double calculateSalary() {
        return bonus + BASE_SALARY;
    }
}
