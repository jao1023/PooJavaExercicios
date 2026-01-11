package aprendendo.poo.interfaces.test01;

public class Main {

    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();
        Hawk h1 = new Hawk();
        Fish f1 = new Fish();
        Fish f2 = new Fish();


        r1.flee();
        h1.hunt();
        f1.flee();
        f1.hunt();
    }
}
