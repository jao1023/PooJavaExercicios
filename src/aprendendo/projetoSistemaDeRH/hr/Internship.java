package aprendendo.projetoSistemaDeRH.hr;

public class Internship extends Employee{
    private double INTERN_SALARY = 1200;
    private double HOURLY_LOAD = 120;

    public Internship(String employeeName, String employeeMail) {
        super(employeeName, employeeMail);
    }

    @Override
    public double calculateSalary() {
        return INTERN_SALARY;
    }

    @Override
    public String getBenefits() {
        return "";
    }
}
