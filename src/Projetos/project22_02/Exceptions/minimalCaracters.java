package Projetos.project22_02.Exceptions;

public class minimalCaracters extends Exception {

    public minimalCaracters(String message) {
        super(message);
    }

    public static void checkPasswordCaracters(String password) throws minimalCaracters{
        if(password.length() < 6){
            System.out.println("Password too short Minimum 6 Caracters");
        }
    }
}
