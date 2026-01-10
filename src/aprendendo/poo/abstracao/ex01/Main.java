package aprendendo.poo.abstracao.ex01;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10,"Gray");
        Circle circle = new Circle("Blue", 3);
        rectangle.calculatearea();
        circle.calculatearea();
        rectangle.calculatePerimeter();
        circle.calculatePerimeter();
    }
}
