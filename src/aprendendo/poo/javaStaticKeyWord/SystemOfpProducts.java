package aprendendo.poo.javaStaticKeyWord;

public class SystemOfpProducts {

    public static void main(String[] args) {
        Product p1 = new Product("Air Pods",399.0);
        Product p2 = new Product("Iphone 17", 899.00);
        Product p3 = new Product("MacBook", 900);
        Product p4 = new Product("Samsung S25", 899.00);
        Product p5 = new Product("Nvidia RTX 5060", 400.00);

        Product.getTotalProducts();
    }
}
