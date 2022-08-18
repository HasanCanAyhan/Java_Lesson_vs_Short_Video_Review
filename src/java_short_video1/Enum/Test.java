package java_short_video1.Enum;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //String day = "Java";
        Day day = Day.MONDAY;
        System.out.println(day);

        System.out.println("-----------------------");

        // it returns array

        Day[] days = Day.values();

        System.out.println(Arrays.toString(days));


        System.out.println("-----------------------");

        //switch statement

        switch (day){

            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday");
        }




    }

}
