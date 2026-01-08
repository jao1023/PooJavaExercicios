package aprendendo.poo.intializerBlock.ex01;

public class Product {
    private String name;
    private double price;

    static {
        System.out.println("initializing the system");
    }
    {
        System.out.println("New product successfully created: ");
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}
