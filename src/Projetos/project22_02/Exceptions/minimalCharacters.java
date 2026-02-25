package Projetos.project22_02.Exceptions;

public class minimalCharacters extends Exception {

    public minimalCharacters(String message) {
        super(message);
    }
    //Exception for check if the password has at least 6 Characters
    public static void checkPasswordCaracters(String password) throws minimalCharacters {
        if(password.length() < 6){
            throw new minimalCharacters("Password too short Minimum 6 Caracters");
        }
    }
}
