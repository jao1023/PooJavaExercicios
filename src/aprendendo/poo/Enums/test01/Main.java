package aprendendo.poo.Enums.test01;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Day day = Day.MONDAY;

        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY-> System.out.println("It is a weekday");

            case SATURDAY,SUNDAY -> System.out.println("It is the weekend");
        }
    }
}
