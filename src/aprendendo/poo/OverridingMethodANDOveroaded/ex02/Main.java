package aprendendo.poo.OverridingMethodANDOveroaded.ex02;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield");
        Dog dog = new Dog("Dog");
        Cow cow = new Cow("Cow");

        cat.makeSound();
        cat.sleep();
        dog.makeSound();
        dog.sleep();
        cow.makeSound();
        cow.sleep();
    }
}
