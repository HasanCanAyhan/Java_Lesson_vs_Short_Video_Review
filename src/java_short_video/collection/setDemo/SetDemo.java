package java_short_video.collection.setDemo;

import java.util.*;


public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(); // accept null
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.add(null);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(); // accept null
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.add(null);

        Set<Integer> treeSet = new TreeSet<>(); // does not accept null
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //treeSet.add(null); // NullPointerException


        System.out.println("hashSet = " + hashSet); // [null, 200, 40, 10, 90, 300]
        System.out.println("linkedHashSet = " + linkedHashSet); //[10, 200, 300, 40, 90, null]
        System.out.println("treeSet = " + treeSet);// [10, 40, 90, 200, 300]

        System.out.println("-----------------------------------------------------");

        // no index number

        for (Integer each : hashSet) {
            System.out.println(each);
        }

        //List<Integer> arrayList = new ArrayList<>(hashSet); convertıng HashSet to Lıst
        // In Set there is not get() method , no index number


        /*
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(arrayList.get(i));
        }
         */


    }



}
