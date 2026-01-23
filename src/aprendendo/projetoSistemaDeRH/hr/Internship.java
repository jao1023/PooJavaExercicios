package aprendendo.projetoSistemaDeRH.hr;

public class Internship extends Employee {
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
    public String getEmployeeBenefits() {
        return " FREE TRANSPORT : FREE FOOD";
    }
}
