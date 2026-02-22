package Exceptions.CustonsExceptions.FinalExercise;

import java.util.Scanner;

public class RegisterCustomer {
    static void main() {
        String name,password;
        int age;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            checkCustomer(name,password,age);
        }catch (CustomerException e){
            System.out.println(e.getMessage());
        }

    }

    public static void checkCustomer(String name, String password, int age) throws CustomerException {
        if(name.length() == 0) {
            throw new CustomerException("Customer name is null");
        }
        if(password.length() < 6) {
            throw new CustomerException("Password is less than 6 characters");
        }
        if(age < 18){
            throw new CustomerException("Age is less than 18");
        }
    }
}
