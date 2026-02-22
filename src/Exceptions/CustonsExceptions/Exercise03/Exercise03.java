package Exceptions.CustonsExceptions.Exercise03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03 {
    static void main() {
        int stock = 5;
        int quantity;
        Scanner sc = new Scanner(System.in);

        try{
             quantity = sc.nextInt();
             stock(quantity,stock);
            System.out.println("Sucess");
        }catch(Stock e){
            System.out.println(e.getMessage());
        }

    }
    public static void stock(int quantity, int stock) throws Stock{
        if(quantity > stock){
            throw new Stock("Stock exceeded");
        }
    }
}
