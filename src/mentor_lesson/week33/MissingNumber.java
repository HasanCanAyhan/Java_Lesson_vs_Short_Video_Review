package mentor_lesson.week33;

import java.util.Arrays;
import java.util.Stack;

public class MissingNumber {

    public static void main(String[] args) {

        //int[] arr1 = {9,6,4,2,3,5,7,0,1}; // ->> 8
        //int[] arr1 = {3,0,1}; //-->> 2
        int[] arr1 = {0,1};


        System.out.println(findMissingNumber(arr1));

    }

    public static int findMissingNumber(int[] arr){

        int n = arr.length;
        int sum =  ( n * (n+1) )/ 2; // 1 + 2+ 3 = 6; // 3

        int sum_arr = 0;
        for (int i = 0; i < arr.length ; i++) {
             sum_arr += arr[i]; // 1
        }

        return sum - sum_arr; // 6 - 4 = 2

    }

    public static int withSorting(int[] nums){

        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != i){
                return i;
            }
        }

        return nums.length;

    }




}
