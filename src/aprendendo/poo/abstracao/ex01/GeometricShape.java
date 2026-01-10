package aprendendo.poo.abstracao.ex01;

public abstract class GeometricShape {
    protected String color;

    public GeometricShape(String color) {
        this.color = color;
    }

    abstract double calculatearea();

    abstract double calculatePerimeter();

    public void descrever(){

    };
}
