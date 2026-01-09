package aprendendo.poo.heranca.ex02;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("T1",32,3000,"Math");
        Teacher t2 = new Teacher("T2",44,4500,"Science");

        Student s1 = new Student("S1",18,"3° Grade");
        Student s2 = new Student("S2", 16,"1° Grade");

        s1.displayStudent();
        s2.displayStudent();

        t1.displayTeacher();
        t2.displayTeacher();
    }
}
