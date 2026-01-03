package aprendendo.poo.javaAcessModifiers.exercicio02;

public class Stock {
    public static void main(String[] args) {
        Product p1 = new Product("PowerBank",349.99,10);
        p1.setStock(3);
        p1.setPrice(1000);
        p1.applyDiscount(10);
        p1.getPrice();
    }
}
