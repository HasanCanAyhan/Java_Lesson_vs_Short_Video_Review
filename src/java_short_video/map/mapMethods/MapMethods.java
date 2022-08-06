package java_short_video.map.mapMethods;

import java.util.LinkedHashMap;

public class MapMethods {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(); // insertion order

        // put() : inserts the key & value as a pair to the map

        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Emma");
        map.put(5,"Isabella");

        System.out.println(map);

        // size() : returns the size ( total number of pairs ) of map

        System.out.println( map.size() ); // 5

        System.out.println("------------------------------------------------");

        // get(key) : returns the value of the given key from map

        System.out.println( map.get(20)  ); // George

        System.out.println("--------------------------------------------------");

        // replace(key, newValue) : replaces the value of the given key

        map.replace(10, "Muhtar");

        System.out.println(map);
        //{10=Muhtar, 20=George, 3=Jack, 40=Emma, 5=Isabella}

        System.out.println("--------------------------------------------------");

        // remove(key) :  removes the given key and its value from the map, size dynamic

        map.remove(10);
        System.out.println(map);
        System.out.println(map.size());// 4
        //{20=George, 3=Jack, 40=Emma, 5=Isabella}

        System.out.println("--------------------------------------------------");

        // containsKey(key) : checks if the given key is contained in the map , returns boolean

        System.out.println(  map.containsKey(25)  ); // false
        System.out.println(  map.containsKey(20)  ); // true

        System.out.println("--------------------------------------------------");

        // containsValue(value) : checks if the given value is contained in the map , returns boolean


        System.out.println( map.containsValue("Emma")  ); // true
        System.out.println( map.containsValue("Can")  ); // false

        System.out.println("--------------------------------------------------");

        // isEmpty() :  checks if the map is empty, returns boolean

        System.out.println( map.isEmpty() ); // false

        System.out.println("--------------------------------------------------");

        // equals(MapObject) :  checks ıf the map ıs equal to the gıven map ın the argument returns boolean

        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(20,"George");
        map2.put(3,"Jack");
        map2.put(40,"Emma");
        map2.put(5,"Isabella");

        System.out.println(  map2.equals(map)     ); // true

        System.out.println( map == map2  ); // false different object

        System.out.println("--------------------------------------------------");

        // clear() : removes all the keys & values from the map , size will be set to 0

        map.clear();

        System.out.println(map); // {}


    }


}
