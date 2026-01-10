package aprendendo.poo.abstracao.ex02;

public class EmployeeSalaryEarner extends Employee{
    double salary;
    public EmployeeSalaryEarner(String name, String enrollment,double salary) {
        super(name, enrollment);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        System.out.println("Salary: " + salary);
        return salary;
    }

}
