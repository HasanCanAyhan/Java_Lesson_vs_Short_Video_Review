package mentor_lesson.week7;

public class PrintDaysOfFourWeeks {

    public static void main(String[] args) {


        String week = "Week: ";
        String day = "  Day: ";

        for (int i = 0; i <= 4 ; i++) {//outer loop will iterate over weeks
            System.out.println(week + i);

            //inner loop will iterate over days of week
            // we need to start from 1 for each week
            //that's why we are assigning 1 to dayCounter for each week
            for (int j = 1; j < 8  ; j++) { // for day

                System.out.println(day + j);
            }



        }








    }

}
/*
Question-2: Print out the days of 4 weeks as a notebook
 */