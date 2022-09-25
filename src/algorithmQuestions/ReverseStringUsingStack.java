package algorithmQuestions;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String str = "Do geese see God";
        str = str.toLowerCase().replace(" ","");

        System.out.println(isPalindrome(str));

    }

    private static String reverse(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }

        //System.out.println(stack.peek());

        String result = "";

        while (!stack.isEmpty()){
            result += stack.pop();
        }

        return result;

    }

    public static boolean isPalindrome(String str){

        return str.equalsIgnoreCase(reverse(str));

    }


}
