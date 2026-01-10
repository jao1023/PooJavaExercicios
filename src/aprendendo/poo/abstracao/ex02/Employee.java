package aprendendo.poo.abstracao.ex02;

public abstract class Employee {
    private String name;
    private String enrollment; //Enrollment = Matricula

    public Employee(String name, String enrollment){
        this.name = name;
        this.enrollment = enrollment;
    };

    public String getName(){
        return name;
    }
    public String getEnrollment(){
        return enrollment;
    }

    abstract double calculateSalary();

    //Data = Dados
    public void displayData(){
        System.out.println("NAME: " + getName());
        System.out.println("ENROLLMENT" + getEnrollment());
        System.out.println("SALARY: " + calculateSalary());
    }
}
