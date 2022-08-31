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

        System.out.println("----------------------");

        System.out.println(solutionWithStream1(arr));

    }

    public static Map<String , Integer> solutionWithStream1(String[] strings){

        Map<String,Integer> map = new HashMap<>();

        Arrays.stream(strings)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(s -> map.put(s,(int)Arrays.stream(strings).filter(p -> p != null && p.equals(s)).count()));


        return map;

    }

    public static Map<String,Long> solutionWithStream2(String[] strings){

        return Arrays.stream(strings)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }


}
