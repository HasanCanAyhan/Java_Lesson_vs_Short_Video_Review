package java_short_video.array;

import java.util.Arrays;

public class Multi_Dimensional_Array {

    public static void main(String[] args) {

        // The N dimensional array contains (N-1) dimensional array

        /*
         int[][] array2D  = new int [3][];
        //dataType arrayRefVar =     number of one -dimensional arrays
         */

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50};
        int[] arr3 = {60,70,80,90};

        /*
        int[][] arr2D = new int[3][]; // 3 one dimensional arrays - the length of 2D array is 3

        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
         */

        int[][]  arr2D = {   {10,20,30}  ,   {40,50}   ,  {60,70,80,90}     }; // That contains 3 one dimensional arrays
        //                       0              1               2


        System.out.println(Arrays.deepToString(arr2D)); // deepToString --->> we print two dimensional array
        // [[10, 20, 30], [40, 50], [60, 70, 80, 90]]

        // {40,50}

        System.out.println( Arrays.toString(arr2D[1])   ); // [40, 50] ; toString -->> because we print one dimensional array

        // 8ß

        System.out.println( arr2D[2][2]   ); // 80 , here we dont need to use toString method, bcause we print Elements


        System.out.println("--------------------------------------");

        /*
        String[] group1 = {"James", "Daniel", "Can", "Boban"}; // 4 names
        String[] group2 = {"Mad", "Dieb", "Can"}; // 3 names
        String[] group3 = {"C", "A", "N", "A", "Y"}; // 5 names};


         */

        String[][] groups = {  {"James", "Daniel", "Can", "Boban"}, {"Mad", "Dieb", "Can"} ,   {"C", "A", "N", "A", "Y"}  };

        System.out.println(Arrays.toString(groups[1])); // [Mad, Dieb, Can]

        System.out.println( groups[2][0]   ); // C

        System.out.println(Arrays.deepToString(groups));
        // [[James, Daniel, Can, Boban], [Mad, Dieb, Can], [C, A, N, A, Y]]


    }



}
