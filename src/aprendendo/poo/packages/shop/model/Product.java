package aprendendo.poo.packages.shop.model;

public class Product {
    private String Name;
    private double Price;
    private int Stock;

    public Product(String Name,double Price, int Stock){
        this.Name = Name;
        this.Price = Price;
        this.Stock = Stock;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public double getPrice(){
        return Price;
    }
    public void setPrice(double Price){
        this.Price = Price;
    }

    public int getStock(){
        return Stock;
    }
    public void setStock(int Stock){
        this.Stock = Stock;
    }

    public void displayInfo(){
        System.out.println("NAME: " + Name);
        System.out.println("PRICE: " + Price);
        System.out.println("AVALIBLE STOCK: " + Stock);
    }

}
