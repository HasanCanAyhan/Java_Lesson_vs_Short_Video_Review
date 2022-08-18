package java_short_video1.functionalInterface_lambdaExpressions.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicatePractice {

    public static void main(String[] args) {

        //public interface BiPredicate<T, U>
        // boolean test(T t, U u);
        // takes 2 argument(any objects) and return boolean

        BiPredicate<int[], Integer> isContains = (arr,element) -> {
            boolean result = false;
            for (int each : arr) {

                if (each == element) {
                    result = true;
                    break;
                }

            }

            return result;

        };

        int[] arr = {1,2,3,4,5};
        boolean r1 = isContains.test(arr,66);
        System.out.println(r1);

    }

}
