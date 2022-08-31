package mentor_lesson.week19;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter_Stream {

    public static void main(String[] args) {

        String str = "success";
        System.out.println( firstUniqueCharacter(str)  );

        System.out.println("----------------------------");

        System.out.println(solutionWithStream(str));

        System.out.println("----------------------------");

        System.out.println(solutionWithStream2(str));

    }

    private static Character firstUniqueCharacter(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();


        int count = 0;
        for (char eachCh : str.toCharArray()) {

            map.put(eachCh, map.getOrDefault(eachCh,0)+1);

        }

        for (Character character : map.keySet()) {

            if (map.get(character) == 1){
                return character;
            }

        }


        return ' ';
    } // solution with map

    private static char solutionWithStream(String str){

        LinkedHashMap<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length() ; i++) {

            char currentChar = str.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar,0)+1);
        }

        Optional<Map.Entry<Character, Integer>> opt = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();

        if (opt.isPresent()){
            return opt.get().getKey();
        }

        return ' ';

    }

    private static char solutionWithStream2(String str){

        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
        }

        return frequencyMap.keySet().stream().filter(ch -> frequencyMap.get(ch) == 1).findFirst().orElse(' ');


    }

    private static char solutionWithStream3(String str){ // difficult part

        Map<Character,Long> frequencyMap = str.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        return frequencyMap.entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                //.map(ch -> ch.getKey())
                .map(Map.Entry::getKey)
                .findFirst().orElse(' ');
    }

}
