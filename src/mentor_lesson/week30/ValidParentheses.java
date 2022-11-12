package mentor_lesson.week30;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = ")()())";

        String s = str.replace(" ", "");

        Stack<Character> characters = new Stack<>();

        if (s.isEmpty()) return;

        for (char ch : s.toCharArray()) {

            if (ch != '('){
                characters.push(ch);
            }

        }

        int c = 1;
        int i = 0;
        while (!characters.isEmpty() && i <= s.length()-1) {

            if (s.charAt(i) != ')') {
                characters.pop();
                c = 2 * c;
            }

            i++;
        }

        System.out.println(c);




    }

}
/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed)
parentheses substring.
Constraints:
● 1 <= s.length <= 104
● s[i] is '(', or ')'.

Example 1:
Input: s = "(()" Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:
Input: s = ")()())" Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:
Input: s = "" Output: 0

 */