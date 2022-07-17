package java_short_video.collections_patika.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPatika {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // polymorphism
        //ArrayList<Integer> list = new ArrayList<>(); // polymorphism

        list.add(10);
        list.add(1);
        list.add(null);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(5);


        System.out.println(list);

        System.out.println("size : "+list.size());
        System.out.println(list.get(3));

        System.out.println("Index of '1': " + list.indexOf(1));// 1
        System.out.println("Last Index of '1': " + list.lastIndexOf(1)); // 6


        System.out.println("Index of 'null': " + list.indexOf(null));//2
        System.out.println("Last Index of 'null': " + list.lastIndexOf(null));//2

        System.out.println(list.lastIndexOf(12)); // -1 there is no

        System.out.println("-------------------------------------------------------");

        list.add(2,15); // öteledi!!

        System.out.println("list = " + list);

        list.set(2,20);

        System.out.println("list = " + list);

        System.out.println("------------------------------------------------");

        System.out.println(list.contains(10));// true

        System.out.println("------------------------------------------------");

        System.out.println("list = " + list);

        System.out.println(list.remove(0));

        System.out.println("list = " + list);


        System.out.println("------------------------------------");


        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("-----------------------------------");

        for( Integer element : list  ){
            System.out.println(element);
        }


        System.out.println("----------------------------------------------------------------------");


        List<String> list1 = new ArrayList<>();

        list1.add("Ankara");
        list1.add("Istanbul");
        list1.add("Amasya");
        list1.add("Bolu");
        list1.add("Erzurum");


        List<String> list2 = new ArrayList<>();
        list2.add("Izmir");
        list2.addAll(list1);
        list2.add("Samsun");

        System.out.println("list2 = " + list2);

        System.out.println("---------------------------------------------");

        //subList()

        /*
        System.out.println("list2 = " + list2);

        list2 = list2.subList(2,4);

        System.out.println("list2 = " + list2);
         */

        System.out.println("-------------------------------------------------");

        String[] str = list1.toArray(new String[0]);
        System.out.println(str[0]); // Ankara

        System.out.println("-----------------------------------");

        list1.clear();
        System.out.println(list1);// empty , []


    }

}
