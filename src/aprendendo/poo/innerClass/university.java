package aprendendo.poo.innerClass;

public class university {

   private String universityName;
   private Student[] students;
   private int currentStudents = 0;

    public university(String universityName){
        this.universityName = universityName;
        this.students = new Student[50];
    }

    public void displayInformation(){
        System.out.println("UNIVERSITY NAME: " + universityName);
    }

   private class Student{
        String name;
        String enrollment;

        public Student(String name, String enrollment){
            this.name = name;
            this.enrollment = enrollment;
        }

        public void displayData(){
            System.out.println("NAME: " + name);
            System.out.println("ENROLLMENT: " + enrollment);
        }
    }

    public void enrrollStudent(String name, String matricula){
        if(currentStudents < students.length) {
            students[currentStudents] = new Student(name, matricula);
            currentStudents ++;
        }else{
            System.out.println("Max students reached");
        }
    }
    public void listStudents(){
        if(currentStudents <= 0){
            System.out.println("No students enrolled yet");
        }else{
            for (int i = 0; i < currentStudents; i++){
                students[i].displayData();
            }
        }
    }
}
