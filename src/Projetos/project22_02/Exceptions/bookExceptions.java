package Projetos.project22_02.Exceptions;

import Projetos.project22_02.Book;

import java.util.Set;

public class bookExceptions extends Exception {
    public bookExceptions(String message) {
        super(message);
    }


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

    public static void verifyAvailable(Set<Book> books,int isbn) throws bookExceptions {
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
}
