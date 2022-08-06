package mentor_lesson.week15;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SummationOfTwoTimeSeries1 {


    public static void main(String[] args) {



        Map<Integer, Double> mapA = new LinkedHashMap<>();
        mapA.put(1, 1.0);
        mapA.put(2, 1.5);
        mapA.put(3, 2.0);

        Map<Integer, Double> mapB = new LinkedHashMap<>();
        mapB.put(2, 1.0);
        mapB.put(3, 2.5);
        mapB.put(5, 1.0);



        summation(mapA, mapB);

    }

    private static void summation(Map<Integer, Double> mapA,Map<Integer, Double> mapB ) {

        Map<Integer, Double> mapC = new LinkedHashMap<>();
        mapC.putAll(mapA);
        mapC.putAll(mapB);

        for (Map.Entry<Integer, Double> eachEntryA : mapA.entrySet()) {

            for (Map.Entry<Integer, Double> eachEntryB : mapB.entrySet()) {

                if (eachEntryA.getKey() == eachEntryB.getKey()){

                    mapC.put(eachEntryA.getKey(),eachEntryA.getValue() + eachEntryB.getValue());

                }

            }

        }


        System.out.println("mapC = " + mapC);



    }


}
