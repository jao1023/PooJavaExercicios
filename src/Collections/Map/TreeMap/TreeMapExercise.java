package Collections.Map.TreeMap;

import java.util.TreeMap;

public class TreeMapExercise {
    static void main() {
        TreeMap<Integer,String> values = new TreeMap<Integer,String>();

        values.put(5,"E");
        values.put(2,"B");
        values.put(4,"D");
        values.put(1,"A");

        System.out.println(values);
        //TreeMap ordena pela chave
    }
}
