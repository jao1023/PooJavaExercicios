package aprendendo.poo.intializerBlock.ex03;

public class Book {
    private static int totalBooks;
    private static String libraryName;
    private int code;
    private String title;
    private boolean avaliable;

    static {
        System.out.println("Library system initialized successfully");
        libraryName = "Central library";
        totalBooks = 0;
    }
    {
        code = totalBooks;
        totalBooks ++;
        avaliable = true;
    }
    {
        System.out.println("New book registered with success! CODE" + code);
    }

    public Book(String title){
        if(title.isEmpty()){
            System.out.println("Erro");
        }else {
            this.title = title;
            System.out.println("Book " + title + "added successfully to the book shelf");
        }
    }

    public boolean borrowBook(){
        avaliable = false;
        return avaliable;
    }

    public boolean returnBook(){
        avaliable = true;
        return avaliable;
    }

    public void displayInfo(){
        System.out.println("LIBRARY: " + libraryName );
        System.out.println("CODE: " + code);
        System.out.println("TITLE: " + title);
        System.out.println("AVALIABLE: " + avaliable);
        System.out.println();
    }
}
