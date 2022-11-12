package mentor_lesson.week26;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};
        System.out.println(singleNum(arr));
    }

    public static int singleNum(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1){
                return entry.getKey();
            }

        }

        return 0;
    }

}
