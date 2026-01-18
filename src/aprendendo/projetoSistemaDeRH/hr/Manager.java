package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.EnableForBonus;

public class Manager extends Employee implements EnableForBonus {
    private double BASE_SALARY = 3600;
    private double bonus = 0.0;

    public Manager(String employeeName,int employeeId, String employeeMail) {
        super(employeeName, employeeId, employeeMail);
    }

    @Override
    public void calculateBonus(double valueInsales){
        bonus = valueInsales * 0.1;
    };
    @Override
    public double calculateSalary() {
        return bonus + BASE_SALARY;
    }

}
