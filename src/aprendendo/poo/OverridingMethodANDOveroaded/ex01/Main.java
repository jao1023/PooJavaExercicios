package aprendendo.poo.OverridingMethodANDOveroaded.ex01;

public class Main {
    public static void main(String[] args) {
        add(1,2);
        add(1.0,2.0);
        add(3,4,5);
        add("João","Victor");
    }

    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }
    static int add(int a, int b,int c){
        return a + b + c;
    }
    static String add(String s1, String s2){
        return s1 + s2;
    }
}
