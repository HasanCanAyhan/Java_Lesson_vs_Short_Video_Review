package mentor_lesson.week6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random random_number = new Random();

        int realNumber = random_number.nextInt(101); // that means 0 to 100

        System.out.println(realNumber);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please try to guess the number between 1-100");
        int quess = scan.nextInt();

        int count = 0;

        while( !(quess == realNumber )   ){

            if (quess > realNumber){
                System.err.println("Your estimation is greater than target number.");
            }else{
                System.err.println("Your estimation is less than target number.");
            }

            System.out.println("Re-enter your estimation :");
            quess = scan.nextInt();

            count ++;

        }

        System.out.println("Congrats, you have found "+ realNumber+ " in "+ ++count + " try");


    }

}
