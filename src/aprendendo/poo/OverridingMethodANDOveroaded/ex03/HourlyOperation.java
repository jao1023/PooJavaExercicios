package aprendendo.poo.OverridingMethodANDOveroaded.ex03;

public class HourlyOperation extends Employee {
    private double workedHours;
    private double hourValue;

    public HourlyOperation(String name,double workedHours, double hourValue) {
        super(name);
        this.hourValue = hourValue;
        this.workedHours = workedHours;
    }

    @Override
    double calculateSalary() {
        setFinalSalary(hourValue * workedHours);
        return hourValue * workedHours;
    }
}
