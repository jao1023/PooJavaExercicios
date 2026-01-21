package aprendendo.projetoSistemaDeRH.hr;

import aprendendo.projetoSistemaDeRH.hr.interfaces.Beneficial;

public class Internship extends Employee implements Beneficial {
    private static final double INTERN_SALARY = 1200;

    public Internship(String employeeName, String employeeMail) {
        super(employeeName, employeeMail);
    }

    //Method for calculate the intern salary;
    @Override
    public double calculateSalary() {
        return INTERN_SALARY;
    }


    @Override
    public String getEmplooyeBenefits() {
        return " FREE TRANSPORT : FREE FOOD";
    }
}
