package Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListExercise {
    static void main() {
        LinkedList<String> tasks = new LinkedList();
        tasks.add("A");
        tasks.add("B");
        tasks.add("C");

        tasks.remove(1);
        tasks.add(0,"New A");
        System.out.println(tasks);
    }
}
