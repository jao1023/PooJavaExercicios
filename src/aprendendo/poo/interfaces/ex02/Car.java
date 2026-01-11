package aprendendo.poo.interfaces.ex02;

public class Car extends Vehicle implements Motorized{
    int gasLiters = 100;
    public Car(String model, String brand, int year, double value) {
        super(model, brand, year, value);
    }

    @Override
    public void accelerate() {
        if(gasLiters > 0) {
            System.out.println("Car is accelerating");
            gasLiters -= 50;
        }else{
            System.out.println("No gas, you need to stop for fillUp");
        }
    }

    @Override
    public void fillUp() {
        if(gasLiters == 0) {
            System.out.println("Car stop in the gas station for fill up");
            gasLiters = 100;
        }else{
            System.out.println("Car have gas in the gas Tank");
        }

    }
}
