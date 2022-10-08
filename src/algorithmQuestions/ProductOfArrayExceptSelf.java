package algorithmQuestions;

import java.util.Arrays;

//https://youtu.be/vVvq9YoNheM

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5};

        //output = {120,60,40,30,24}

        System.out.println(Arrays.toString( productExceptSelf(nums) ));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int[] left_side = new int[nums.length];
        int[] right_side = new int[nums.length];

        //int[] nums = {1,2,3,4,5};

        //output = {120,60,40,30,24}

        left_side[0] = 1;
        right_side[right_side.length-1] = 1;

        for (int i = 1; i < left_side.length ; i++) {
            left_side[i] = nums[i-1] * left_side[i-1];
        }

        for (int i = right_side.length - 2; i >= 0; i--) {
            right_side[i] = nums[i+1] * right_side[i+1];
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = left_side[i] * right_side[i];
        }



        return result;

    }


}
