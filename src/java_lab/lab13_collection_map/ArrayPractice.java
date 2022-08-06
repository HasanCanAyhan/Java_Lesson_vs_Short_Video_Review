package java_lab.lab13_collection_map;

import java_lab.lab12_oop_exceptions.restaurantTask_byme.Chef;
import java_lab.lab12_oop_exceptions.restaurantTask_byme.Employee;
import java_lab.lab12_oop_exceptions.restaurantTask_byme.Server;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        nums = new int[5];

        System.out.println(  Arrays.toString(nums)  );

        System.out.println("-------------------------------------");

        int[] scores = { 10,20,30,40,50  }; // array literal

        //int[] scores2 = new int[]{10,20,30,40,50};

        System.out.println("-------------------------------------");


        int[][] arr2D = {}; // for 1-D Array
        int[][][] arr3D = {}; // for 2-D Array


        System.out.println("-------------------------------------");

        /*
        Employee[] employees = {new Chef("Daniel",42,'M',"B01","Head Chef",85000),
                new Server("Emily",35,'F',"A01",55000)};

        System.out.println(Arrays.toString( employees ));

         */

    }


}
