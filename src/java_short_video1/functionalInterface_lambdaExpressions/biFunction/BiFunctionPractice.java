package java_short_video1.functionalInterface_lambdaExpressions.biFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        //public interface BiFunction<T, U, R>
        // R apply(T t, U u);
        // takes 2 arguments and return a value(any object)

        BiFunction<int[], int[] , List<Integer>> mergeArraysToList = (arr1,arr2) -> {

            List<Integer> result = new ArrayList<>();

            for (int each : arr1) {
                result.add(each);
            }

            for (int each : arr2) {
                result.add(each);
            }

            return result;
        };

        int[]arr1 = {1,2,3};
        int[]arr2 = {4,5};
        List<Integer> list = mergeArraysToList.apply(arr1,arr2);
        System.out.println(list);

    }

}
