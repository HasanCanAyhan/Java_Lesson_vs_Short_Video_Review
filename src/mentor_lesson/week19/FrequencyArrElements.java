package mentor_lesson.week19;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyArrElements {

    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};


        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {

            map.put(each, map.getOrDefault(each,0)+1);

        }
        System.out.println(map);






    }

}
