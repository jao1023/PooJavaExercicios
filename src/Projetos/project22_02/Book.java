package Projetos.project22_02;

public class Book {
    int ISBN;
    String title;
    String author;
    String publisher;
    String description;
    Boolean available;

    public Book(int ISBN, String title, String author, String publisher, Boolean available, String description) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.available = available;
        this.description = description;
    }


    public String getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }

}
