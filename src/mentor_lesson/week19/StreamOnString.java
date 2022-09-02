package mentor_lesson.week19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOnString {

    public static void main(String[] args) {

        String input = "hello hello";

        //find the vowels count in the string

        long count = input.chars().filter(x -> {

            return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');

        }).count();

        System.out.println("vowel counts :  "+count);

        //find the duplicates  in the string

        Map<String, Long> collect = input.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Objects::toString, Collectors.counting()));

        System.out.println("collect = " + collect);

        collect.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach( entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


    }

}
