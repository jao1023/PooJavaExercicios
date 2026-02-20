package Collections.Set.HashSet;

import java.util.HashSet;

public class HashSetExercise {
    static void main() {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.add(3);

        System.out.println(numbers.contains(4));
        System.out.println(numbers);
    }
}
