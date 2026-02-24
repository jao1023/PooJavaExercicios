package Projetos.project22_02.Exceptions;

import Projetos.project22_02.Book;

import java.util.Set;

public class bookExceptions extends Exception {
    public bookExceptions(String message) {
        super(message);
    }


    public static void bookNotFound(Set<Book> books, int isbn) {
        int notFound;
        for (Book b : books) {
            if (b.getISBN() != isbn) {
                notFound = 1;
            }

            System.out.println("Book not found");
        }
    }
}
