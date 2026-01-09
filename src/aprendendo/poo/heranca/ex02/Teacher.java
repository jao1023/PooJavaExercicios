package aprendendo.poo.heranca.ex02;

public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(String name, int age, double salary,String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }

    public void displayTeacher(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }

    public double getSalary(){
        return salary;
    }

    public String getSubject(){
        return subject;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
}

