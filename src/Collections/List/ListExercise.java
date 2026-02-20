package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    static void main() {
        List<String> names = new ArrayList<String>();

        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Julie");
        names.add("Julie");

        System.out.println("FIRST NAME OF THE LIST: " + names.getFirst());
        System.out.println("LAST NAME OF THE LIST: " + names.getLast());
        System.out.println("SIZE OF THE LIST: " + names.size());
    }
}
