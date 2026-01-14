package aprendendo.poo.OverridingMethodANDOveroaded.ex02;

public class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("The cow is moo");
    }

}
