package java_short_video1.functionalInterface_lambdaExpressions.consumer;

import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {

        // void accept(T t);
        // takes one argument(any object) and does not return a value -> void

        Consumer<int[]> printEach = numbers -> {
            for (int each : numbers) {
                System.out.println(each);
            }
        };

        int[] numbers = {1,2,3,4,5};
        printEach.accept(numbers);

    }

}
