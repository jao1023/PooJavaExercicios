package Colections.ArrayList.ex02;

import java.util.ArrayList;

public class Ex02 {
    static void main() {
        int total = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for(int i =0; i < numbers.size(); i++){
            total += numbers.get(i);
        }
        System.out.println(total);
    }
}
