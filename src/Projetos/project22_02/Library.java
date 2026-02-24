package Projetos.project22_02;

import Projetos.project22_02.Exceptions.emptyField;
import Projetos.project22_02.Exceptions.minimalCaracters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static Projetos.project22_02.Exceptions.emptyField.checkEmptyBookField;
import static Projetos.project22_02.Exceptions.emptyField.checkEmptyUserField;
import static Projetos.project22_02.Exceptions.minimalCaracters.checkPasswordCaracters;

public class Library {
    static void main() {
        Set<User> users = new HashSet<>();
        Set<Book> books = new HashSet<>();

        int userId = 1;
        int bookISBN = 1;
        int ISBN;

        int booksRegistred = 0;
        int usersRegistred = 0;
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
                //Case for register one user in the system
                case 1:
                    try {
                        sc.nextLine();
                        System.out.println("Enter your name");
                        String userName = sc.nextLine();
                        System.out.println("Enter your email");
                        String userEmail = sc.nextLine();
                        System.out.println("Enter your password (MINIMUM 6 CHARACTERS)");
                        String userPassword = sc.nextLine();

                        checkEmptyUserField(userName, userEmail, userPassword);
                        checkPasswordCaracters(userPassword);

                        User user = new User(userId, userName, userEmail, userPassword);
                        users.add(user);
                        userId++;
                        usersRegistred++;
                    }catch (emptyField | minimalCaracters e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    //Case for register one book in the system
                case 2:
                    try {
                        sc.nextLine();
                        System.out.println("Enter book TITLE");
                        String bookTitle = sc.nextLine();
                        System.out.println("Enter book AUTHOR");
                        String bookAuthor = sc.nextLine();
                        System.out.println("Enter book PUBLISHER");
                        String bookPublisher = sc.nextLine();
                        System.out.println("Enter book DESCRIPTION");
                        String bookDescription = sc.nextLine();

                        checkEmptyBookField(bookTitle,bookAuthor,bookPublisher,bookDescription);

                        boolean isAvailable = true;
                        Book book = new Book(bookISBN, bookTitle, bookAuthor, bookPublisher, isAvailable, bookDescription);
                        books.add(book);
                        bookISBN++;
                        booksRegistred++;
                    }catch (emptyField e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    //Case for delete one book, you can delete any book by the ISBN of the book
                case 3:
                    ISBN = 0;
                    if(booksRegistred == 0) {
                        System.out.println("NO BOOKS REGISTERED");
                        break;
                    }
                    for(Book b : books) {
                        System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:"  + b.getPublisher() +  "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:"+ b.getAvailable() + "]");
                    }
                            System.out.println("Enter book ISBN");
                            ISBN = sc.nextInt();

                    for(Book b : books) {
                        if(b.getISBN() == ISBN){
                            System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:"  + b.getPublisher() +  "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:" + b.getAvailable() + "]");
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
                    //Case for borrow one book
                case 4:
                    ISBN = 0;
                    if(booksRegistred == 0) {
                        System.out.println("NO BOOKS REGISTERED");
                        break;
                    }
                    for(Book b : books) {
                        System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:"  + b.getPublisher() + "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:"+ b.getAvailable() + "]");
                    }
                    System.out.println("Enter book ISBN");
                    ISBN = sc.nextInt();

                    for(Book b : books) {
                        if(b.getISBN() == ISBN){
                            b.setAvailable(false);
                        }
                    }

                    break;
                    //Case for return the book
                case 5:
                    ISBN = 0;
                    if(booksRegistred == 0) {
                        System.out.println("NO BOOKS REGISTERED");
                        break;
                    }
                    for(Book b : books) {
                        if(b.getAvailable() == false){
                        System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:"  + b.getPublisher() + "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:"+ b.getAvailable() + "]");
                        }
                    }
                    System.out.println("Enter book ISBN");
                    ISBN = sc.nextInt();


                    for(Book b : books) {
                        if(b.getISBN() == ISBN && b.getAvailable() == false) {
                            b.setAvailable(true);
                        }
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Enter book title");
                    String bookTitleS = sc.nextLine();

                    for(Book b : books) {
                        if(b.getTitle().contains(bookTitleS) ) {
                            System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:"  + b.getPublisher() + "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:"+ b.getAvailable() + "]");
                        }
                    }
                    break;
                    //Case for search users by name
                case 7:
                    sc.nextLine();
                    System.out.println("Enter book title");
                    String Username = sc.nextLine();

                    for(User u : users) {
                        if(u.getName().contains(Username) ) {
                            System.out.println("[USER ID:" + u.getId() + "| USER NAME:" + u.getName() + "| EMAIL:" + u.getEmail() + "]");
                        }
                    }
                    break;
                    //Case for see all registred books
                case 8:
                    if(bookISBN == 1){
                        System.out.println("No books Registred");
                        break;
                    }
                    for(Book b : books) {
                        System.out.println("[BOOK ISBN:" + b.getISBN() + "| BOOK TITLE:" + b.getTitle() + "| BOOK AUTHOR:" + b.getAuthor() + "| BOOK PUBLISHER:"  + b.getPublisher() + "| BOOK PUBLISHER:" + b.getPublisher() + "| IS AVALIABLE:"+ b.getAvailable() + "]");
                    }
                    break;
                    //Case for see all registred users
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
