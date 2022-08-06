package mentor_lesson.week15;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "";

        System.out.println( frequencyOfCh(str));

    }

    public static Map<String,Integer> frequencyOfCh(String str){

        Map<String,Integer> map = new LinkedHashMap<>();

        /*
        if (str.isEmpty()){
            return map;
        }

         */

        if (str == null){
            return null;
        }else{
            String[] arr =  str.split("");
            for (String each : arr) {

                int frequency = Collections.frequency(Arrays.asList(arr),each);

                if (each.isEmpty()) {
                    break;
                }else {
                    map.put(each,frequency);

                }

            }


        }


        return map;


    }



}
