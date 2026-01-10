package aprendendo.poo.abstracao.ex02;

public class HoristicEmployee extends Employee{
    double workedHours;
    double valuePerHour;
    public HoristicEmployee(String name, String enrollment, double workedHours, double valuePerHour) {
        super(name, enrollment);
        this.valuePerHour = valuePerHour;
        this.workedHours = workedHours;
    }

    @Override
    double calculateSalary() {
        double salary = valuePerHour * workedHours;
        System.out.println("Salary: " + salary);
        return salary;
    }


}
