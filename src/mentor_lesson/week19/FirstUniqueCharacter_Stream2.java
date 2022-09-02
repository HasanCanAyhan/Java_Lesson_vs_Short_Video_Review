package mentor_lesson.week19;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter_Stream2 {

    public static void main(String[] args) {

        String str = "success";

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println("frequencyMap = " + frequencyMap);

        Character character = frequencyMap.keySet().stream().filter(key -> frequencyMap.get(key) == 1).findFirst().get();
        System.out.println("character = " + character);

        System.out.println("-----------------------------------------------------------------------");

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        str.chars().mapToObj(s -> (char)s)
                .forEach(ch-> freqMap.put(ch,freqMap.getOrDefault(ch,0)+1));

        System.out.println("freqMap = " + freqMap);

        Character character1 = freqMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println("character1 = " + character1);

    }


}
