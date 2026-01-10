package aprendendo.poo.abstracao.ex01;

public class Circle extends GeometricShape{

    double ray;
    double PI = 3.14;
    double area;
    double perimeter;

    public Circle(String color, double ray) {
        super(color);
        this.ray = ray;
    }

    double calculatearea() {
        area = PI * (ray * ray);
        System.out.println("AREA: " + area);
        return area;
    }

    double calculatePerimeter() {
        perimeter = 2 * PI * ray;
        System.out.println("PERIMETER: " + perimeter);
        return perimeter;
    }
}
