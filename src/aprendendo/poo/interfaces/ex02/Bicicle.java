package aprendendo.poo.interfaces.ex02;

public class Bicicle extends Vehicle{
    int energy = 100;
    public Bicicle(String model, String brand, int year, double value) {
        super(model, brand, year, value);
    }

    public void pedal(){
        if(energy >= 50){
            System.out.println("cycling fast ");
            energy -= 20;
        } else if (energy > 20 && energy <= 49) {
            System.out.println("cycling");
            energy -= 10;
        }else{
            System.out.println("You need to stop for charge your energy");
        }
    }

    public void chargeEnergy(){
        if(energy <= 20){
            System.out.println("Energy charged");
            energy += 100;
        }else{
            System.out.println("You don't need energy");
        }
    }
}
