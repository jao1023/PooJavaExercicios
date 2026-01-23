package aprendendo.projetoSistemaDeRH;

import aprendendo.projetoSistemaDeRH.hr.HourlyEmployee;
import aprendendo.projetoSistemaDeRH.hr.MonthlyEmployee;

public class Main {
    static void main() {
        HourlyEmployee h1 = new HourlyEmployee("asd","joao",10,10);
        HourlyEmployee h2 = new HourlyEmployee("asd","joao",10,10);
        HourlyEmployee h3 = new HourlyEmployee("asd","joao",10,10);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        h1.calculateSalary();


    }
}
