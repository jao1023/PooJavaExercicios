package aprendendo.poo.heranca.ex01;

public class Manager  extends Employee{

    public Manager(double salary){
        super(salary);
    }

    public void increaseSalary(double value){
        setSalary(salary += value);
    }
}
