package mentor_lesson.week4;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter a integer for seconds:");
        int seconds = input.nextInt();

        // Find minutes in seconds

        int minutes = seconds / 60;

        // Seconds remaining

        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");



        input.close();

    }


}
