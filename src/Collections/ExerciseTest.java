package Collections;

import java.util.TreeMap;

public class ExerciseTest {
    static void main() {
        TreeMap<Integer,String> players = new TreeMap<Integer,String>();
        players.put(100,"A");
        players.put(200,"B");
        players.put(150,"C");

        System.out.println(players);
    }
}
