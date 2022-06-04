package mentor_lesson.week4;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {


        /*

1 quarter = 25 cents
1 dime = 10 cents
1 nickle = 5 cents

 */
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.println(" Enter a cents amount : (ex : 95  cents) ");
        int amount = input.nextInt();


        int remaining = 0; // We have to find out what we have at the end of the process, such as first - second process

        if (amount > 0 && amount < 100){ // Pre Condition : The given cents value should be more than 0 and less than 100.

            // Find the number of quarters in amount

            int numberOfQuarters = amount / 25;

            // Find the remaining amount

            remaining = amount % 25 ;

            // Find the number of dimes

            int numberOfDimes = remaining / 10;

            // Find  the remaining amount

            remaining = remaining % 10;

            // Find the number of nickels in the remaining amount

            int numberOfNickels = remaining / 5;

            // Find  the remaining amount

            remaining = remaining % 5 ;

            // Find the number of pennies in the remaining amount

            int numberOfPennies = remaining;

            // Display result
            System.out.println("Your amount " + amount + " consists of");
            System.out.println(" " + numberOfQuarters+ " quarters ");
            System.out.println(" " + numberOfDimes + " dimes");
            System.out.println(" " + numberOfNickels + " nickels");
            System.out.println(" " + numberOfPennies + " pennies");


        }else{ // the given input/value from user is invalid!
           String result = "Invalid cents amount";
            System.out.println(result);
        }







    }

}
