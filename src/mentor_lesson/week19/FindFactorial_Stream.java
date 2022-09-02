package mentor_lesson.week19;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFactorial_Stream {

    public static void main(String[] args) {

        //Write a method that returns the factorial number of any given number.

        int num = 5;
        factorial(num);
    }

    private static void factorial(int num) {
        int factorial = IntStream.range(1, num +1).reduce(1,(a, b) -> a*b);
        System.out.println(factorial);
    }

}
