package aprendendo.poo.heranca.ex01;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(1500);
        manager.displaySalary();
        manager.increaseSalary(3000);
        manager.displaySalary();
    }

}
