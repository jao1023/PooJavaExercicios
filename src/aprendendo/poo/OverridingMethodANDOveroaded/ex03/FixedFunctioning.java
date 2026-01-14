package aprendendo.poo.OverridingMethodANDOveroaded.ex03;

public class FixedFunctioning extends Employee{
    public FixedFunctioning(String name) {
        super(name);
    }
    private double baseSalary = 1600.00;
    public double getBaseSalary(){
        return baseSalary;
    }
    @Override
    double calculateSalary() {
        setFinalSalary(baseSalary);
        return baseSalary;
    }
    double calculateSalary(double bonus) {
        setFinalSalary(baseSalary + bonus);
        return baseSalary + bonus;
    }
}
