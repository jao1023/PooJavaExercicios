package aprendendo.projetoSistemaDeRH;

import aprendendo.projetoSistemaDeRH.hr.HourlyEmployee;
import aprendendo.projetoSistemaDeRH.hr.MonthlyEmployee;
import aprendendo.projetoSistemaDeRH.operations.Project;

public class Main {
    static void main() {
        HourlyEmployee h1 = new HourlyEmployee("asd","joao",10,10);
        HourlyEmployee h2 = new HourlyEmployee("asd","joao",10,10);
        HourlyEmployee h3 = new HourlyEmployee("te","joao",10,10);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        h1.calculateSalary();

        Project p1 = new Project("a",130, h3);
        p1.addEmployee(h1);
        p1.addEmployee(h2);
        System.out.println(p1);
    }
}
