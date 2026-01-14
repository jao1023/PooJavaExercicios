package aprendendo.poo.OverridingMethodANDOveroaded.ex02;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("The Dog is barking");
    }

}
