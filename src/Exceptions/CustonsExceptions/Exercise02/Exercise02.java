package Exceptions.CustonsExceptions.Exercise02;

import java.util.Scanner;


public class Exercise02 {
    static void main() {
        int amountInHands = 100;
        int balance = 500;
        int value;
        do {


            Scanner sc = new Scanner(System.in);
            System.out.println("CHOSE AN OPTION");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount you want to deposit");
                    value = sc.nextInt();
                    try {
                        deposit(value, amountInHands);
                        System.out.println("Successfully deposited");
                        balance += value;
                        amountInHands -= value;
                    } catch (Transactions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    value = sc.nextInt();

                    try {
                        withdraw(value, balance);
                        System.out.println("Successfully withdrawn");
                        balance -= value;
                        amountInHands += value;
                    } catch (Transactions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("you actual balance is " + balance);
                    System.out.println("In hands you have " + amountInHands);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }while (true);
    }
        public static void withdraw ( int value, int balance) throws Transactions {
            if (value > balance) {
                throw new Transactions("You don't have the necessary value");
            }
        }
        public static void deposit ( int value, int amountInHands) throws Transactions {
            if (amountInHands < value) {
                throw new Transactions("You don't have the necessary value in hands");
            }
        }
    }

