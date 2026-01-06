package aprendendo.poo.packages.shop;
import aprendendo.poo.packages.shop.model.Customer;
import aprendendo.poo.packages.shop.model.Product;
import aprendendo.poo.packages.shop.service.processSale;

import static aprendendo.poo.packages.shop.service.processSale.processSale;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Turbo",3000,10);
        Product product1 = new Product("Pipes", 299.99, 3);
        Product product2 = new Product("Carbon Fiber Hood", 1500,1);

        Customer customer = new Customer("João", "133.706.319-38", "joaovictorgoncalveskiko@gmail.com");
        Customer customer1 = new Customer("Pedro", "123.456.789-10", "pedro@gmail.com");

        processSale(product2, 1, customer);
        processSale(product, 3, customer1);
        processSale(product, 10, customer1);
    }
}
