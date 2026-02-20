package Collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExercise {
    static void main() {
        LinkedHashSet<String> values = new LinkedHashSet<String>();

        values.add("C");
        values.add("A");
        values.add("B");

        System.out.println(values);
        //Fica assim pois armazena a ordem que foi inserido

    }
}
