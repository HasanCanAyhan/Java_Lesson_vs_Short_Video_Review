package mentor_lesson.week20;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSum_TwoPointerStrategy {

    public static void main(String[] args) {

        Integer[] nums = {16,3,11,5,15};

        Collections.sort(Arrays.asList(nums));

        System.out.println(Arrays.toString(nums));
        //[3, 5, 11, 15, 16]

        int target = 8;

        List<Integer> list = Arrays.stream(nums).flatMap(integer -> Arrays.stream(nums).filter(integer1 -> integer + integer1 == target)).collect(Collectors.toList());
        System.out.println("list = " + list);
        System.out.println("----------------------------------------------------");

        Integer[] arr = {-3,2,3,3,6,8,15};

        System.out.println(Arrays.toString( twoSum(arr,8)  ));



    }
    public static int[] twoSum(Integer[] nums, int target){
        //[3, 5, 11, 15, 16]
        int start = 0;
        int end = nums.length -1;

        int result[] = new int[2];

        while(start < end){

            int sum = nums[start] + nums[end];
            if (sum == target){
                result[0] = start ;
                result[1] = end ;
                System.out.println(nums[start] + " , " + nums[end]);
                break;
            } else if (sum < target) {
                start++;
            }else{
                end--;
            }

        }

        return result;

    }


}
