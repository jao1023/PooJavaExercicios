package aprendendo.poo.heranca.ex02;

public class Student extends Person{
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayStudent(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + grade);
    }
}
