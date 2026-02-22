package Exceptions.CustonsExceptions.Exercise01;

import java.util.Scanner;

public class Exercise01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            verifyAge(age);
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }

    public static void verifyAge(int age) throws AgeException {
        if(age < 0){
            throw new AgeException("Your age has to be greater than 0");
        }
        if(age > 130){
            throw new AgeException("Your age has to be less than 130");
        }
    }
}
