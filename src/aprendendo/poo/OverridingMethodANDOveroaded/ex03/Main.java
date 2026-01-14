package aprendendo.poo.OverridingMethodANDOveroaded.ex03;

import aprendendo.poo.abstracao.ex02.HoristicEmployee;

public class Main {
    public static void main(String[] args) {
        FixedFunctioning f1 = new FixedFunctioning("Joao");
        f1.calculateSalary(300);
        f1.displayData();

        HourlyOperation h1 = new HourlyOperation("Jota",100,15);
        h1.calculateSalary();
        h1.displayData();
    }
}
