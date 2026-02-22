package Exceptions.ExceptionsExistentes;

import java.util.Scanner;

public class Exercise02 {
    static void main() {
        String[] names = {"Joao","Pedro","Leticia","Isabella","Gustavo"};
        Scanner sc = new Scanner(System.in);

        int index = 0;
        try {
            System.out.println("Please enter a number for access one index of the array");
            index = sc.nextInt();
            System.out.println(names[index]);
        }catch(ArrayIndexOutOfBoundsException e) {
            if(index < names.length){
                System.out.println("You have to enter a number higher than -1");
            }
            if(index >= names.length){
                System.out.println("You have to enter a number lower than 5");
            }
        }
    }
}
