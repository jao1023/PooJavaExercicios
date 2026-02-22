package Exceptions.ExceptionsExistentes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x/y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide any number by zero");
        } catch (InputMismatchException e) {
            System.out.println("You need to enter two numbers, you can't enter with letters");
        }



    }
}
