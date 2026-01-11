package aprendendo.poo.interfaces.ex02;

public class Vehicle implements Movable{
   private String model;
   private String brand;
   private int year;
   private double value;

   public Vehicle(String model, String brand, int year, double value){
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.value = value;
   }

   public String getModel(){
       return model;
   }
   public String getBrand(){
       return brand;
   }
   public double getValue(){
       return value;
   }
   public int getYear(){
       return year;
   }
   public void displayInfo(){
       System.out.println("MODEL: " + model);
       System.out.println("BRAND: " + brand);
       System.out.println("YEAR: " + year);
       System.out.println("VALUE: " + value);
   }

    @Override
    public void move() {

    }
}
