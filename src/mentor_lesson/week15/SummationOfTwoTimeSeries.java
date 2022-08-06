package mentor_lesson.week15;

import java.util.*;

public class SummationOfTwoTimeSeries {

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


        for (Integer eachKeyA : mapA.keySet()) {

            for (Integer eachKeyB : mapB.keySet()) {

                if (eachKeyA == eachKeyB){

                    mapC.put(eachKeyA,mapA.get(eachKeyA) + mapB.get(eachKeyB));

                }

            }

        }

        System.out.println("mapC = " + mapC);



    }


}