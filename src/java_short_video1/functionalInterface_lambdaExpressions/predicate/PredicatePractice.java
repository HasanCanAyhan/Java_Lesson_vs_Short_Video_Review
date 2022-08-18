package java_short_video1.functionalInterface_lambdaExpressions.predicate;

import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {

        // takes one argument(any object) and returns boolean

        Predicate<Integer> isEven = a ->   a % 2 == 0;

        boolean r1 = isEven.test(300);
        System.out.println(r1);
        //System.out.println( isEven.test(10) );

        Predicate<String> isPalindrome = str -> {

            String reversed = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                reversed += str.charAt(i);
            }

            boolean result =  str.equalsIgnoreCase(reversed);
            return result;
        };

        System.out.println(isPalindrome.test("Ana"));


    }

}
