package java_short_video.map.iteratingTheMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {

    public static void main(String[] args) {

        // keySet , values , entrySet

        Map<Integer, String> map = new LinkedHashMap<>(); // insertion order

        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Emma");
        map.put(5,"Isabella");

        // Iterating by keys : keySet() :  returns all the keys of map(Set), returns type (Set)

        // key type is Integer
        for(  Integer  eachKey : map.keySet() ) {
            System.out.println(eachKey);
        }

        System.out.println("----------------------");

        // shortcut : for each loop
        for (Integer eachKey : map.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println("----------------------------------------");

        // Iterating by values : values() :  returns all the values of map(Collection), returns type Collection

        // value type is String
        for (String eachValue : map.values()) {
            System.out.println(eachValue);
        }


        System.out.println("----------------------------------------");

        // Iterating by entries : entrySet() :  returns all the entries of map(Set), returns type Set


        for (  Map.Entry<Integer,String> eachEntry    :   map.entrySet()  ){

            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
            //       those methods (getKey() and getValue() comes from Entry Interface)
        }

        /*
        10 : Arthur
        20 : George
        3 : Jack
        40 : Emma
        5 : Isabella
         */




    }

}
