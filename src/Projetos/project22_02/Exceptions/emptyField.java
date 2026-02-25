package Projetos.project22_02.Exceptions;

public class emptyField extends Exception {
    public emptyField(String message) {
        super(message);
    }
    //Verify if the fields for register one user is filled, if one input not filled he throws the exception
    public static void checkEmptyUserField(String name,String email,String password) throws emptyField  {
        if(password.isEmpty() || email.isEmpty() || name.isEmpty()){
            throw new emptyField("You need to fill all fields");
        }
    }
    //Verify if the fields for register one book is filled, if one input not filled he throws the exception
    public static void checkEmptyBookField(String title,String author,String publisher,String description) throws emptyField{
            if(title.isEmpty() || author.isEmpty() || publisher.isEmpty() || description.isEmpty()){
                throw new emptyField("You need to fill all fields");
            }
    }

}
