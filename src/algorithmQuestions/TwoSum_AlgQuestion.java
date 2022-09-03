package algorithmQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

//https://youtu.be/TcsYEnMrnFo

public class TwoSum_AlgQuestion {

    public static void main(String[] args) {

        int[] arr = {2,3,7,4,8};

        int targetValue = 7;
        // result-7
        //output-[1,3]

        Map<Integer,Integer> map = new LinkedHashMap<>();

        int[] new_arr = new int[2];
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(targetValue-arr[i])){
                new_arr[0] = map.get(targetValue-arr[i]);
                new_arr[1] = i;
            }


            map.put(arr[i],i);


        }

        System.out.println(Arrays.toString(new_arr));

    }

}
