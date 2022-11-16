package mentor_lesson.week30;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = ")()())";

        System.out.println(longestValidParentheses(s));

    }


    public static int longestValidParentheses(String s) {   //  ) ( ) ( ) )

        if(s == null) {
            return 0;
        }
        Stack<Integer> stack = new Stack();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 &&
                    s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;


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