package mentor_lesson.week34;

import java.util.Arrays;

public class UpdateEveryElementWithMultpPrevAndNextElmnt {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};

        System.out.println(Arrays.toString( findUpdatedElements(arr) ));
    }

    public static int[] findUpdatedElements(int[] arr){

        int[] new_arr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) new_arr[i] = arr[i] * arr[i+1];
            else if (i == arr.length-1) new_arr[i] =  arr[i] * arr[i-1];
            else {
                int prev = i-1;
                int curr = i+1;

                new_arr[i] = arr[prev] * arr[curr] ;

            }


        }



        return new_arr;

    }

}
