package mentor_lesson.week29;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class ValidAnagram {

    /*
    Given two strings s and t, return true if t is an anagram of s, and false
    otherwise.
    An Anagram is a word or phrase formed by rearranging the letters
    of a different word or phrase, typically using all the original letters
    exactly once

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
    Example 2:
    Input: s = "rat", t = "car"
    Output: false
     */

    public static void main(String[] args) {

        String s = "anagram";
        String r = "nagaram";

        System.out.println(isAnagram(s, r));


    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) +1);
        }

        System.out.println(map);

        for (int i = 0; i < t.length() ; i++) { // nagaram

            if (map.containsKey(t.charAt(i))){ // a:3, r=1, m =1, n=1, g=1
                if (map.get(t.charAt(i)) == 1){
                    map.remove(t.charAt(i));
                }else {
                    map.put(t.charAt(i), map.get(t.charAt(i)) -1);
                }

            }

        }

        return map.size() == 0;
    }


}
