package Collections.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetExercise {
    static void main() {
        TreeSet<Integer> Numbers = new TreeSet<>();
        Numbers.add(50);
        Numbers.add(10);
        Numbers.add(30);
        Numbers.add(20);

        System.out.println(Numbers);
        //Fica assim por causa que ele ordena pelo valor
    }
}
