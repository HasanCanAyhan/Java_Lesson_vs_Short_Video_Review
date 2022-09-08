package java_short_video1.stream.intermediate_terminal_OP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intermediate_terminal_OP {

    public static void main(String[] args) {

        // intermediate op done

        // terminal op


        //collect
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));


        list1 = list1.stream().filter(p -> p %2 == 0).collect(Collectors.toList());
        System.out.println("list1 = " + list1);

        System.out.println("-----------------------------");

        //toArray
        int[] array = {1,2,3,4,5,6,7};

        array = Arrays.stream(array).filter(p -> p > 4).map(n -> n*10).toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------");


        //count

        long count = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).count();
        System.out.println(count);

        long count1 = Stream.of("Java", "Python", "Java", "C#", "Java").filter(p -> p.equals("Java")).count();
        System.out.println(count1);

        System.out.println("-----------------------------");

        // reduce

        String[] words = {"Java","Python","C#","Java"};

        String reduce = Arrays.stream(words).reduce("", (a, b) -> a +" " +  b);
        System.out.println(reduce);

        System.out.println("-----------------------------");
        // forEach, min, max,

        //allMatch
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        boolean b = list2.stream().allMatch(p -> p > 5);
        System.out.println(b);

        System.out.println("---------------------");


        //anyMatch

        boolean b1 = list2.stream().anyMatch(p -> p > 8);
        System.out.println(b1);

        System.out.println("--------------------------");

        //noneMatch

        boolean b2 = list2.stream().noneMatch(p -> p > 10);
        System.out.println(b2);


    }


}
