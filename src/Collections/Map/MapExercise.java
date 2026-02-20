package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    static void main() {
        Map<Integer,String> names = new HashMap<>();

        names.put(1,"João");
        names.put(2,"Maria");
        names.put(3,"Pedro");
        System.out.println(names.get(2));
    }
}
