package aprendendo.projetoSistemaDeRH.hr;

public class HourlyEmployee extends Employee{
    //Variables for calculate the salary of Hourly Employee
    private double workedHours;
    private double hourValue;

    //Constructor
    public HourlyEmployee(String employeeName, int employeeId, String employeeMail , double workedHours, double hourValue) {
        super(employeeName, employeeId, employeeMail);
        this.workedHours = workedHours;
        this.hourValue = hourValue;
    }

    //Method for calculate employee salary
    @Override
    public double calculateSalary() {
        return workedHours * hourValue;
    }
}
