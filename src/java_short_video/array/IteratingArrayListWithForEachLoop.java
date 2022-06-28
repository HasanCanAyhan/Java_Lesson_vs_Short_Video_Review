package java_short_video.array;

import java.util.ArrayList;

public class IteratingArrayListWithForEachLoop {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // ArraysList is part of Collection
        numbers.add(10); // index : 0
        numbers.add(20); // index : 1
        numbers.add(30); // index : 2
        numbers.add(40); // index : 3
        numbers.add(50); // index : 4
        numbers.add(60); // index : 5, last index = size() -1

        //      int   each
        for ( Integer each   :  numbers   ){
            System.out.println(each); // 10 ~ 60
        }


        System.out.println("----------------------------------------");

        // shortcut numbers.for

        for (Integer each : numbers) {
            System.out.println(each);
        }



    }

}
