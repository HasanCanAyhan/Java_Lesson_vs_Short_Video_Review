package algorithmQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_AllSolutions {

    public static void main(String[] args) {
        String str = "MCMXCIV";

        convertRomanToInt(str);
        System.out.println(romanToInt(str));

    }

    public static void convertRomanToInt(String s){

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(s.charAt(s.length()-1)); // I

        for (int i = s.length()-2 ; i >= 0 ; i--) {

            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }else{
                result += map.get(s.charAt(i));
            }

        }

        System.out.println(result);



    }

    public static int romanToInt(String s){

        if (s == null || s.isBlank()) return -1;

        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int prev = 0;
        int total = 0;

        for (int i = s.length() -1; i >= 0 ; i--) {

            int current = map.get(s.charAt(i)); // V,I,C

            if (prev < current) total += current; //0 + 5 = 5,
            else total -= current; // 5 -1 = 4,

            prev = current;

        }

        return total;


    }



}
/*
􀀀 Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.
􀀀 Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
􀀀 Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
􀀀 Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the
range [1, 3999].

Input: s = "MCMXCIV"
Output: 1994
Explanation:
iteration 1 : 0 (previous) V = 5 (current) previous < current total = total + current
iteration 2 : V = 5 (previous) I = 1 (current) previous > current total = total - current
iteration 3 : I = 1 (previous) C = 100 (current) previous < current total = total + current
iteration 4 : C = 100 (previous) X = 10 (current) previous > current total = total - current
.
.


 */
