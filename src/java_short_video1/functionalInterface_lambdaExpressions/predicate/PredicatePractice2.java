package java_short_video1.functionalInterface_lambdaExpressions.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,6,7,1,1,1,1,1,2,3));

        Predicate<Integer> isEven = p -> p %2 == 0;

        list.removeIf(isEven);

        //list.removeIf(p -> p %2 == 0);

        System.out.println(list);

    }

}
