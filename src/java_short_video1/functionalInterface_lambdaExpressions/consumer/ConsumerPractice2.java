package java_short_video1.functionalInterface_lambdaExpressions.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Max","Josh","Breanna"));

        names.forEach( p -> {
            if (p.startsWith("J")){
                System.out.println(p);
            }
        } );


    }

}
