package aprendendo.poo.heranca.ex01;

public class Employee {

    protected double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double value){
        salary = value;
    }

    public void displaySalary(){
        System.out.println("Salary: " + salary);
    }
}
