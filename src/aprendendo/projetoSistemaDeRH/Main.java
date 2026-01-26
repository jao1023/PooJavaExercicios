package aprendendo.projetoSistemaDeRH;

import aprendendo.projetoSistemaDeRH.hr.HourlyEmployee;
import aprendendo.projetoSistemaDeRH.hr.MonthlyEmployee;
import aprendendo.projetoSistemaDeRH.operations.Project;

public class Main {
    static void main() {
        HourlyEmployee h1 = new HourlyEmployee("Felipe","Felipe",10,10);
        HourlyEmployee h2 = new HourlyEmployee("Pedro","Pedro",10,10);
        HourlyEmployee h3 = new HourlyEmployee("Joao","joao",10,10);


        Project p1 = new Project("a",130, h3);
        p1.addEmployee(h1);
        p1.displayTeam();
        System.out.println(p1);
    }
}
