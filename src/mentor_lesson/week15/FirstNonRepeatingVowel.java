package mentor_lesson.week15;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {

    public static void main(String[] args) {

        String str = "responsible";


        System.out.println( firstNonRepeatingVowel(str)  );

    }

    public static int firstNonRepeatingVowel(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length() ; i++) {

            Character each = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length() ; j++) {

                Character ch = str.charAt(j);

                if (each == ch){
                    frequency++;
                }

            }

            map.put(each,frequency);

        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getKey() == 'a' || entry.getKey() == 'e' || entry.getKey() == 'i' || entry.getKey() == 'o'|| entry.getKey() == 'u'  ){
                if (entry.getValue() == 1){
                    return str.indexOf(entry.getKey());
                }
            }


        }


        return -1;
    }

}
