package aprendendo.poo.OverridingMethodANDOveroaded.ex02;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("The Cat is meow");
    }

}
