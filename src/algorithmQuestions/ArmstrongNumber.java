package algorithmQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num :");
        int number = input.nextInt();
        int temp = number;

        int numberofdigits = 0;
        int valueofdigits;

        int result = 0;




        while ( (number !=0) ){
            number /= 10;
            numberofdigits++;
        }

        System.out.println(numberofdigits);

        System.out.println("---------------------------------");


        while(temp != 0){ // 2451
            valueofdigits = temp % 10; // 1,5,4,2
            System.out.println(valueofdigits);
            // 1 ^ 4 , 5 ^ 4, 4 ^ 4 , 2 ^ 4
            int pow = 1;
            for (int i = 1 ; i <= numberofdigits; i++){
                pow *= valueofdigits;

            }
            result += pow;
            temp /= 10;
        }

        System.out.println(result);



    }



}
