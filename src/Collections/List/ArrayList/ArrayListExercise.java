package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListExercise {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        numbers.remove(5);
        System.out.println("NUMBERS IN THE ARRAY LIST: " + numbers);
    }
}
