package aprendendo.poo.javaStaticKeyWord;

public class SystemConfig {

    static String systemName = "My System";
    private static double systemVersion = 0.1;
    static String defaultLanguage = "Portuguese";

    static void showConfiguration(){
        System.out.println("System name: " + systemName);
        System.out.println("system version: " + systemVersion);
        System.out.println("System language: " + defaultLanguage);
    }

    static void changeLanguage(String newLanguage){
        defaultLanguage = newLanguage;
    }
}
