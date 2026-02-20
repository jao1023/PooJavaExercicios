package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    static void main() {
        Set<String> Brands = new HashSet<String>();

        Brands.add("BMW");
        Brands.add("AUDI");
        Brands.add("MERCEDES-BENZ");
        Brands.add("MERCEDES-BENZ");

        System.out.println(Brands);
    }


}
