package aprendendo.poo.OverridingMethodANDOveroaded.ex03;

public abstract class Employee {

    private String name;
    private double finalSalary;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFinalSalary(double finalSalary){
        this.finalSalary = finalSalary;
    }

    abstract double calculateSalary();

    public void displayData(){
        System.out.println("NAME: " + name);
        System.out.println("SALARY: " + finalSalary);
    }
}
