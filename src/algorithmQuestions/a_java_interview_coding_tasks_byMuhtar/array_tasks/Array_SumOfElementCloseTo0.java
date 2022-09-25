package algorithmQuestions.a_java_interview_coding_tasks_byMuhtar.array_tasks;

import java.util.Arrays;

public class Array_SumOfElementCloseTo0 {

    /*
        return the sum of the two elements closest to zero
     */

     /*
        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative one.
        */

    /* Another Question : Find the Sub-array with sum closest to 0
    Input : arr[] = {-1, 3, 2, -5, 4}
    Output : 1, 3
    Subarray from index 1 to 3 has sum closest to 0 i.e.
    3 + 2 + -5 = 0

    Input : {2, -5, 4, -6, 3}
    Output : 0, 2
    2 + -5 + 4 = 1 closest to 0
         */

    public static void main(String[] args) {

        int[] arr = {-1, 3, 2, -5, 4};


        System.out.println(getSumOfTwoClosestToZeroElements2(arr)); // 1
    }


    public static int getSumOfTwoClosestToZeroElements2(int[] a) {
        /*
        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative one.
        */

        int b[] = new int[2];
        int z = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (z == 0)
                    z = sum;
                if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {
                    z = sum;
                    b[0] = a[i];
                    b[1] = a[j];
                }
            }

        return z;
    }


}
