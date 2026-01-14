package aprendendo.poo.OverridingMethodANDOveroaded.test02;

public class Main {

    public static void main(String[] args) {

        String pizza = bakePizza("Test","Cheddar");
        System.out.println(pizza);
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread,String chesse){
        return bread + " pizza with " + chesse;
    }
}
