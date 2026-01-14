package aprendendo.poo.OverridingMethodANDOveroaded.ex02;

public class Animal {

    String name;

    public Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("The animal is making the sound");
    }

    public void sleep(){
        System.out.println("The animal is sleeping " + name);
    }
}
