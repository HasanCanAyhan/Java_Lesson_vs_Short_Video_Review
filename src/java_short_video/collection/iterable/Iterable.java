package java_short_video.collection.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {

    public static void main(String[] args) {

        // allows the object to be Iterated by using Iterator

        // is used when we want to remove elements

        // iterator() method

        // it provides ready methods : hasNext() , next() , remove()

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        /* that is false!!!!!
        for (int i = 0; i < list.size(); i++) {


            if(list.get(i) < 4){
                list.remove(i);
            }


        }

        System.out.println(list);


         */

        Iterator<Integer>  it = list.iterator();

        while(it.hasNext()){

            Integer element = it.next();

            if (element < 4){
                it.remove();
            }

        }


        System.out.println(list);// [4, 5, 6, 6, 5, 4, 4]

        System.out.println("-------------------------------------");


        // 2.way

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        list2.removeIf( p ->  p < 4  );

        System.out.println(list2); // [4, 5, 6, 6, 5, 4, 4]


    }

}
