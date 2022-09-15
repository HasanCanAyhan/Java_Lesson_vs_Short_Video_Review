package algorithmQuestions;

import java.util.Arrays;

public class TwoSum_Pointer {

    public static void main(String[] args) {

        int[] nums = {-3,2,3,3,6,8,15};

        // -3 , 2 , 3 , 3 , 6 , 8 , 15
        //  ^                       ^

        int target = 8;

        System.out.println(Arrays.toString(twoSum_UsingPointer(nums,target)));

    }

    public static int[] twoSum_UsingPointer(int[]arr, int target){

        int start = 0;
        int end = arr.length-1;

        Arrays.sort(arr);

        int[] result = new int[2];

        while (start < end ){

            int sum = arr[start] + arr[end];

            if (sum == target){

                result[0] = arr[start];
                result[1] = arr[end];
                break;

            }else if (sum > target){
                end--;
            }else{
                start++;
            }

        }


        return result;

    }

}
