package aprendendo.poo.javaStaticKeyWord;

public class ConversorInformations {
   static double convertedTemperature;

    static double celsiusToFahrenheit(double celsius){
        convertedTemperature = (celsius * 9/5) + 32;
        System.out.println(celsius + " Equals " + convertedTemperature);
        return convertedTemperature;
    }

    static double FahrenheitToCelsius(double fahrenheit){
        convertedTemperature = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Equals " + convertedTemperature);
        return convertedTemperature;
    }

    static double celsiusToKevin(double celsius){
        convertedTemperature = celsius + 273.15;
        System.out.println(celsius + " Equals " + convertedTemperature);
        return convertedTemperature;
    }
}
