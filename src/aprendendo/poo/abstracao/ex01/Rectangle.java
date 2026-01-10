package aprendendo.poo.abstracao.ex01;

import aprendendo.poo.packages.bank.model.Account;

public class Rectangle extends GeometricShape{
    double high;
    double base;
    double area;
    double perimeter;


    public Rectangle(double base,double high,String color){
        super(color);
        this.base = base;
        this.high = high;
    }

    double calculatearea() {
        area = base * high;
        System.out.println("AREA: " + area);
        return area;
    }

    double calculatePerimeter() {
        perimeter = 2 * (base + high);
        System.out.println("PERIMETER: " + perimeter);
        return perimeter;
    }
}
