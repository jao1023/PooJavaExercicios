package aprendendo.poo.classesEobjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Worked hours in the week: ");
        int WorkedHours = scan.nextInt();
        System.out.println("The value per hour: ");
        int valuePerHour = scan.nextInt();
        Pokemon p1 = new Pokemon(name);
        System.out.println(p1.nome);
        p1.salario(WorkedHours,valuePerHour);
    }

}
