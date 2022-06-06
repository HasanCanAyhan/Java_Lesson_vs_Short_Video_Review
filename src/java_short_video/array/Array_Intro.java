package java_short_video.array;

import java.util.Arrays;

public class Array_Intro {

    public static void main(String[] args) {

        // 2 Ways : Declaring arrays

        /*

        int[] scores;
        String[] names;
        Student[] students;

        System.out.println("----------------");

        int scores[];
        String names[];
        Student students[];

         */


        // Instantiating arrays

        /*
        int[] scores;
        scores = new int[4];  // 4--->> size-element

        // or:

        int[] scores = new int[4];
        String[] names = new String[5]; // 5--->> size-element
         */


        // Assigning values to Array Elements

        int[] numbers1 = new int[6];


        numbers1[0] = 20;
        //arrayRefVar[ index ] = value
        numbers1[3] = 30;

        System.out.println("-------------------------------------------------------------");


        // 1.create a variable named numbers that can have 5 integers

        int[] numbers = new int[5];  // numbers = [0, 0, 0, 0, 0]   ====>>> index: 0 1 2 3 4
        // ---->>> 5 elements,  length = 5

        //System.out.println("numbers = " + numbers); // hashcode

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
       // numbers[5] = 60; // error : .ArrayIndexOutOfBoundsException -->>  max index number = 4;

        System.out.println(numbers.length);
        System.out.println("numbers = " + Arrays.toString(numbers) );


        System.out.println("--------------------------------");

        // Array Initialization

        // Like regular variables --- it used when you know how many elements and what they are inside the array.


        // 2.Create a variable named colors that has : Yellow,Red,White,Blue,Green,Black

        String[] colors = {"Yellow","Red","White","Blue","Green","Black"};

        System.out.println(colors.length);// ===>>> size : 6

        System.out.println("colors = " + Arrays.toString(colors) );



    }


}
