package aprendendo.poo.finalKeyWord;

public class appConfig {
   //Static variables for dont have to instace the objetct for use
   //Final because this information cant be changed
   static final String APP_NAME = "MyApp";
   static final int MAX_USERS = 1;
   static final double VERSION = 1.0;
   static int CURRENT_USERS = 0;

    public static void addUser(){
        if(CURRENT_USERS < MAX_USERS){
        CURRENT_USERS += 1;
        }else{
            System.out.println("ERROR: MAX USERS HAS BEEN ADDED");
        }
    }

    public static void displayInfo(){
        System.out.println("APP NAME: " + APP_NAME);
        System.out.println("MAX USERS: " + MAX_USERS);
        System.out.println("APP VERSION: " + VERSION);
        System.out.println("CURRENT USERS: " + CURRENT_USERS);
    }

}
