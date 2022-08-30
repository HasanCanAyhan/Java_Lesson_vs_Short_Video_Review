package mentor_lesson.week19;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter_Stream {

    public static void main(String[] args) {

        String str = "success";
        System.out.println( firstUniqueCharacter(str)  );

    }

    private static Character firstUniqueCharacter(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char eachCh : str.toCharArray()) {

                map.put(eachCh, map.getOrDefault(eachCh,0)+1);

        }

        for (Character character : map.keySet()) {

            if (map.get(character) == 1){
                return character;
            }

        }


        return ' ';
    }

}
