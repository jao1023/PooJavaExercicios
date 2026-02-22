package Projetos.project22_02;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Library {
    static void main() {
        Set<User> users = new HashSet<>();
        Set<Book> books = new HashSet<>();

        int userId = 1;
        int bookISBN = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("LIBRARY SYSTEM, CHOOSE ONE OPTION");
            System.out.println("1.REGISTER USER");
            System.out.println("2.REGISTER BOOK");
            System.out.println("3.DELETE BOOK");
            System.out.println("4.BORROW BOOK");
            System.out.println("5.RETURN BOOK");
            System.out.println("6.SEARCH BOOK");
            System.out.println("7.SEARCH USER");
            System.out.println("8.VIEW ALL BOOKS");
            System.out.println("9.VIEW ALL USERS ");
            System.out.println("0.EXIT");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter your name");
                    String userName = sc.nextLine();
                    System.out.println("Enter your email");
                    String userEmail = sc.nextLine();
                    System.out.println("Enter your password");
                    String userPassword = sc.nextLine();

                    User user = new User(userId,userName,userEmail,userPassword);

                    users.add(user);
                    userId++;

                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter book TITLE");
                    String bookTitle = sc.nextLine();
                    System.out.println("Enter book AUTHOR");
                    String bookAuthor = sc.nextLine();
                    System.out.println("Enter book PUBLISHER");
                    String bookPublisher = sc.nextLine();
                    System.out.println("Enter book DESCRIPTION");
                    String bookDescription = sc.nextLine();

                    boolean isAvailable = true;
                    Book book = new Book(bookISBN,bookTitle,bookAuthor,bookPublisher,isAvailable,bookDescription);
                    books.add(book);
                    bookISBN++;
                    break;
                case 3:
                    String title = null;
                    int ISBN = 0;
                    System.out.println("ENTER THE BOOK ISBN");

                            System.out.println("Enter book ISBN");
                            ISBN = sc.nextInt();


                    if(bookISBN == 1) {
                        System.out.println("NO BOOKS REGISTERED");
                    }
                    for(Book b : books) {
                        if(b.getISBN() == ISBN){
                            System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:" + b.getAvailable() + "]");
                            System.out.println("1.DELETE BOOK");
                            System.out.println("2.CANCEL");
                            choice = sc.nextInt();
                            if(choice == 1) {
                                books.remove(b);
                            }
                            break;
                        }else{
                            System.out.println("BOOK NOT FOUND");
                        };

                    };
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    if(bookISBN == 1){
                        System.out.println("No books Registred");
                        break;
                    }
                    for(Book b : books) {
                        System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK AUTHOR:"  + b.getAuthor() + "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:"+ b.getAvailable() + "]");
                    }
                    break;
                case 9:
                    if(userId == 1){
                        System.out.println("No Users Registred");
                        break;
                    }
                    for(User u : users) {
                        System.out.println("[USER ID:" + u.getId() + "| USER NAME:" + u.getName() + "| EMAIL:" + u.getEmail() + "]");
                    }
                    break;
                case 0:
                    System.exit(0);
                    sc.close();
                    break;
                default:
                    System.out.println("Choose an valid option");
                    break;
            }



        }while(true);

    }
}
