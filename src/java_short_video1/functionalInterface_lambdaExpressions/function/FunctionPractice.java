package java_short_video1.functionalInterface_lambdaExpressions.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {

        //public interface Function<T, R>
        //  R apply(T t);
        //takes one argument(any object) and return a value(any object) :R

        //       T:parameterType R:return type
        Function<int[], List<Integer>> arrayToList = array -> {

            List<Integer> list = new ArrayList<>();
            for (int each : array) {
                list.add(each);
            }
            return list;

        };

        int[] arr = {1,2,3,4,5,10,20,30};
        List<Integer>list =  arrayToList.apply(arr);

        System.out.println(list);


    }

}
