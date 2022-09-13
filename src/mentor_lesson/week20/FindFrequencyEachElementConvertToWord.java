package mentor_lesson.week20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyEachElementConvertToWord {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};

        Map<Integer, Long> map = Arrays.stream(arr).mapToObj(i -> i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("map = " + map);

        List<String> strList = Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","more than ten times");

        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " is " + strList.get(entry.getValue().intValue() -1 ) + " times");
        });




    }

}
