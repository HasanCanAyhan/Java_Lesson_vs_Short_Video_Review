package mentor_lesson.week6;

import java.util.Scanner;

public class GuessTheNumber_by_me {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 100);  // 50
        System.out.println(randomNum);


        System.out.println("enter your guess:" );
        int guessNumber = input.nextInt();


        for (int i = 0; ;) {


            if (guessNumber > randomNum) {

                System.err.println("Your guess is too high!");
                System.err.println("Try gain please!");
                System.out.println("enter your guess:" );
                guessNumber = input.nextInt();
            } else if (guessNumber < randomNum) {
                System.err.println("Your guess is too low!");
                System.err.println("Try again please");
                System.out.println("enter your guess:" );
                guessNumber = input.nextInt();
            } else {
                System.out.println("Cong!!! Exact match!!" + (guessNumber == randomNum));

                System.out.println("Yes the number is " + guessNumber);
                break;
            }

             input.close();

        }






    }

}
