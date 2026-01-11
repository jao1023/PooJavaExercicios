package aprendendo.poo.interfaces.ex02;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("M3 F80","BMW",2017,399000);
        Motorcycle m = new Motorcycle("S1000 RR", "BMW", 2026, 120000);
        Bicicle b = new Bicicle("Viking","Viking", 2020,3500);

        //b.displayInfo();
       // c.displayInfo();
      //  m.displayInfo();

     //   c.accelerate();
     //   c.accelerate();
     //   c.accelerate();
     //   c.fillUp();
     //   c.accelerate();

        b.pedal();
        b.pedal();
        b.pedal();
        b.pedal();
        b.pedal();
        b.pedal();
        b.chargeEnergy();
        b.pedal();
    }
}
