package Colections.ArrayList.ex01;

import java.util.ArrayList;

public class Ex01 {
    static void main() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ana");
        names.add("Carlos");
        names.add("Beatriz");
        names.add("Diego");
        names.remove(1);
        names.add("Fernanda");

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}
