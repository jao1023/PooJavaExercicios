package aprendendo.poo.javaAcessModifiers.exercicio02;

public class Product {
    //Private variables
    private String name;
    private double price;
    private int stock;

    //Public Constructor
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //Getters and setters
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public double getPrice(){
        return price;
    }
    //Verify if price is bigger than 0
    public void setPrice(double newPrice){
        if(newPrice > 0) {
            this.price = newPrice;
            System.out.println("New Price was set sucessfull");
        }else{
            System.out.println("Price can't be negative or 0");
        }
    }
    public int getStock(){
        return stock;
    }
    //Verify if stock its equals or bigger than 0
    public void setStock(int newStock){
        if(newStock >= 0) {
            this.stock = newStock;
            System.out.println("New Stock was set sucessfull");
        }else {
            System.out.println("Stock can't be negative");
        }
    }
//Function for calculate and aply in the price the new value with discount
    public void applyDiscount(double discountValue){
        double discount = (price * discountValue)/100;
        double newPrice = price - discount;
        this.price = newPrice;
        System.out.println("New price with Discount: " + newPrice);
    }

}
