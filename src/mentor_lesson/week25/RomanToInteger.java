package mentor_lesson.week25;

//https://youtu.be/dlATMslQ6Uc

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String str = "LVIII";

        System.out.println(romanToInteger(str));


    }

    public static int  romanToInteger(String s){

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(s.charAt(s.length()-1)); // first ch of given string as int

        for (int i = s.length()-2 ; i >= 0 ; i--) {

            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }else{
                result += map.get(s.charAt(i));
            }

        }

        return result;


    }

}
