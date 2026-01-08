package aprendendo.poo.intializerBlock.ex03;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Os segredos da mente milionaria");
        Book b2 = new Book("Ted Talks");
        Book b3 = new Book("Como convencer alguem em 90 segundos");

        b1.borrowBook();
        b2.borrowBook();

        b2.returnBook();

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
