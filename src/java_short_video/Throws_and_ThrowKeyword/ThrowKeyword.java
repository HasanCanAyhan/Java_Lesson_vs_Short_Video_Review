package java_short_video.Throws_and_ThrowKeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    // used for manually throwing an exception

    // throw new ExceptionType(MessageString);

    public static void main(String[] args) {

        System.out.println("Hello");

        //throw new ArithmeticException("Wrong Calculation");

        //System.out.println("World"); // Unreachable statement

        // throw  new InterruptedException(); checked exception 2 way : throws or try&catch

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 130){
            throw new InputMismatchException("Invalid Age: " + age);
        }

        System.out.println("age = " + age);




    }

}
