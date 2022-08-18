package java_short_video1.functionalInterface_lambdaExpressions.biConsumer;

import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumerPractice2 {

    public static void main(String[] args) {

        Map<String , Integer> map = new LinkedHashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);

        map.forEach(  (k,v) -> {

            if (v >= 30){
                System.out.println(k + " : " + v);
            }


        }  );



    }

}
