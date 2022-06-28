package java_short_video.array;

import java.util.Arrays;

public class Array_Patika {

    public static void main(String[] args) {


        int[] list = new int[10];

      //  System.out.println(list.length);

        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) +10;
            System.out.println(list[i]);
        }

        System.out.println(Arrays.toString(list));

        System.out.println("-----------------------------------------");

        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("numbers = " + Arrays.toString(numbers));







    }

}
