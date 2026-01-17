package aprendendo.poo.Records.Test01;


import java.util.Objects;

public class EmployeeClass {
    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString(){
        return "EmployeeClass(Name = " + this.getName() + ", Employee Number: " + employeeNumber;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,employeeNumber);
    }
}
