package Exceptions.ExceptionsExistentes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03 {
    static void main() {
       do {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter an integer");
                int x = sc.nextInt();
                return;
            }catch(InputMismatchException e){
                System.out.println("You have to enter an integer");
            }
        }while(true);
    }
}
