package Colections.ArrayList.ex03;

import java.util.ArrayList;

public class Ex03 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> filtred = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(15);
        numbers.add(6);
        numbers.add(22);
        numbers.add(4);
        numbers.add(17);

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > 10){
                filtred.add(numbers.get(i));
            }
        }
        System.out.println(filtred);
    }
}
