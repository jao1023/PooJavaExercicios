package aprendendo.poo.javaStaticKeyWord;

public class Product {

    String name;
    double price;
    static int productsCounter = 0;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        productsCounter += 1;
    }

    static void getTotalProducts(){
        System.out.println("Total of products " + productsCounter);
    }
}
