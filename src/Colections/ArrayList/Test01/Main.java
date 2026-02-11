package Colections.ArrayList.Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int namesInArray = 0;
        ArrayList <String> names = new ArrayList<String>();
        String name;

        Scanner scan = new Scanner(System.in);
do {
    name = scan.nextLine();
    names.add(name);
    namesInArray++;
}while (namesInArray <= 2);

        for(int i = 0; i < names.size(); i++){
            System.out.println( i+": " +names.get(i));
        }

        int remove = scan.nextInt();

        names.remove(remove);

        for(int i = 0; i < names.size(); i++){
            System.out.println( i+": " +names.get(i));
        }
    }
}
