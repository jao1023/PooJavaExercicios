package aprendendo.poo.packages.shop.service;

import aprendendo.poo.packages.shop.model.Customer;
import aprendendo.poo.packages.shop.model.Product;

public class processSale {

   public static boolean processSale(Product product, int quantity, Customer customer){
        boolean processSale;
        if(quantity <= product.getStock()){
            product.setStock(product.getStock() - quantity);;
             processSale = true;
            System.out.println("SUCESS!");
            System.out.println("CUSTOMER: " + customer.getNAME() + " PRODUCT: " + product.getName());
            System.out.println("PRICE PER UN: " + product.getPrice());
            System.out.println("TOTAL: " + product.getPrice() * quantity);
        }else{
            System.out.println("You try to buy many products than products in stock");
             processSale = false;
        }



        return processSale;
    }
}
