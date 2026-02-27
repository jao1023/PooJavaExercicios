package DateAndTimeExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeExamples {
   public static void main(String[] args) {
        //Method for get the local date
        LocalDate date = LocalDate.now();
        //Method for get local time
        LocalTime time = LocalTime.now();

        //Method for get Local date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        //Method for format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //Pass the method in a new string for just print the String
        String newDate = localDateTime.format(formatter);

        System.out.println(newDate);
        System.out.println(date);


    }
}
