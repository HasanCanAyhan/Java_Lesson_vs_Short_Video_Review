package mentor_lesson.week19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayOfDigits {

    public static void main(String[] args) {


        int num = 490;

        String str = ""+num;

        int[] arr = Arrays.stream(str.split("")).mapToInt(s -> Integer.parseInt(s)).toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------");

        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        System.out.println(Arrays.toString(digits));


    }



}
