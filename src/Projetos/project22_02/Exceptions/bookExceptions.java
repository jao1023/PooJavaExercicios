package Projetos.project22_02.Exceptions;

import Projetos.project22_02.Book;

import java.util.Set;

public class bookExceptions extends Exception {
    public bookExceptions(String message) {
        super(message);
    }

    //Exception for verify it the book exist
    public static void bookNotFound(Set<Book> books, int isbn) throws bookExceptions {
        int  notFound = 0;
        for (Book b : books) {
            if (b.getISBN() != isbn) {
                notFound = 1;
            }
        }

        if(notFound == 1){
            throw new bookExceptions("Book not found");
        }

    }
    //Exception for verify if the book that user is trying to borrow is available for borrow
    public static void verifyAvailableBorrow(Set<Book> books,int isbn) throws bookExceptions {
        int notAvailable = 0;
        for(Book b : books){
            if(b.getISBN() == isbn){
               if(b.getAvailable() == false){
                   notAvailable = 1;
               }
            }
        }
        if(notAvailable == 1){
            throw new bookExceptions("Book isn't available");
        }
    }
    //Exeception for verify if the book that user is trying to return is borrowed
    public static void verifyAvailableReturn(Set<Book> books,int isbn) throws bookExceptions {
        int Available = 0;
        for(Book b : books){
            if(b.getISBN() == isbn){
                if(b.getAvailable() == true){
                    Available = 1;
                }
            }
        }
        if(Available == 1){
            throw new bookExceptions("The book is available");
        }
    }
}
