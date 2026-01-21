package aprendendo.projetoSistemaDeRH;

import aprendendo.projetoSistemaDeRH.hr.HourlyEmployee;
import aprendendo.projetoSistemaDeRH.hr.MonthlyEmployee;

public class Main {
    static void main() {
        HourlyEmployee h1 = new HourlyEmployee("asd","joao",10,5);
        h1.displayData();
        h1.calculateSalary();


    }
}
