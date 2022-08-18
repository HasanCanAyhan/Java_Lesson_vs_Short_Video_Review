package java_short_video1.functionalInterface_lambdaExpressions.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerPractice {

    public static void main(String[] args) {

        //public interface BiConsumer<T, U>
        // void accept(T t, U u);
        // takes 2 argument(any object) and does not return any value : void

        BiConsumer<String,Integer> printMultipleTimes = (str,number) -> {
            System.out.println(str.repeat(number));
        };

        printMultipleTimes.accept("Can",5);


    }

}
