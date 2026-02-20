package Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExercise {
    static void main() {
        LinkedHashMap<Integer,String> value = new LinkedHashMap<>();

        value.put(3,"C");
        value.put(1,"A");
        value.put(2,"B");
        System.out.println(value);
        //Fica assim por que mantem a ordem inserida
    }
}
