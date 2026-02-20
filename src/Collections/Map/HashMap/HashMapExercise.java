package Collections.Map.HashMap;

import java.util.HashMap;

public class HashMapExercise{
    static void main() {
        HashMap<Integer,String> Products = new HashMap<>();

        Products.put(1,"Iphone 17");
        Products.put(2,"Xiaomi 17 ultra");
        Products.put(3,"Samsung S24 Ultra");

        Products.replace(2,"Iphone 16 Pro");
        System.out.println(Products);
        //Houve uma substituição do valor da chave 2
     }
}
