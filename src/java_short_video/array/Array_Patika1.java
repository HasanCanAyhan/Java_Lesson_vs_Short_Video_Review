package java_short_video.array;

import java.util.Scanner;

public class Array_Patika1 {

    public static void main(String[] args) {

        int[] number_list = {3,3,3,3,4,5,6,7,8,9};

        // find out how many times "3" appaers in the number_list

        int count = 0;

        for (int i = 0; i < number_list.length; i++) {

            if(   number_list[i] == 3         ){

                count++;

            }

        }

        System.out.println("count = " + count); // 4

        System.out.println("-----------------------------------------");

        // How many times the number received from the user  appears in the Array

       /*
        int[] number_list1 = {3,3,3,3,4,5,6,7,8,9};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int num = input.nextInt(); // 3

        int count_num = 0;

        for (int i = 0; i < number_list1.length; i++) {

            if(number_list[i] == num){
                count_num++;
            }

        }

        System.out.println("count_num = " + count_num); // 4

        */

        System.out.println("-----------------------------------------");

        // Min Element from the given array

        int[] number_list2 = {3,3,3,3,4,5,1,7,8,9};

        int min = number_list2[0]; // we assume that.
        int minIndex = 0; // where is the min num in the array??

        for (int i = 0; i < number_list2.length; i++) {

            if( number_list2[i] < min   ){
                min = number_list2[i];
                minIndex = i;
            }

        }

        System.out.println("min = " + min);
        System.out.println("minIndex = " + minIndex);



    }

}
