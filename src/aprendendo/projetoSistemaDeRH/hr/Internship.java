package aprendendo.projetoSistemaDeRH.hr;

public class Internship extends Employee{
    public Internship(String employeeName,int employeeId, String employeeMail) {
        super(employeeName, employeeId, employeeMail);
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
