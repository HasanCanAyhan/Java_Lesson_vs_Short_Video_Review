package mentor_lesson.week7;

public class PrintDaysOfFourWeeks1 {

    public static void main(String[] args) {

        // while & do-while


        String week = "week: ";
        String day = "  day: ";

        int week_counter = 1;
        while(week_counter <= 4){

            System.out.println(week + week_counter);

            int day_counter = 1;
            do {

                System.out.println(day + day_counter);
                day_counter++;

            }while(day_counter <=7);

            week_counter++;
        }





    }

}
