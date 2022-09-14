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

        int pointer1 = 0;
        int pointer2 = 1;

        int target = 8;

        int[] arr = new int[2];
        for (int i = 0; i < nums.length -1; i++) {

            if (nums[pointer1] + nums[pointer2] == target){
                arr = new int[]{pointer1,pointer2};
                System.out.println(Arrays.toString(arr));
                System.out.println(nums[pointer1] + " - " + nums[pointer2]);

            }

            pointer1++;
            pointer2++;

        }

        System.out.println("----------------------");

        List<Integer> list = Arrays.stream(nums).flatMap(integer -> Arrays.stream(nums).filter(integer1 -> integer + integer1 == target)).collect(Collectors.toList());
        System.out.println("list = " + list);

    }

}
