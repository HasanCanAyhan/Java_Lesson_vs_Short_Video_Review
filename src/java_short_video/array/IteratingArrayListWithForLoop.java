package java_short_video.array;

import java.util.ArrayList;

public class IteratingArrayListWithForLoop {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // index : 0
        numbers.add(20); // index : 1
        numbers.add(30); // index : 2
        numbers.add(40); // index : 3
        numbers.add(50); // index : 4
        numbers.add(60); // index : 5, last index = size() -1

        // with get() method

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(  numbers.get(i)  ); // 10~60
            /*
            10
            20
            30
            40
            50
            60

             */
        }


        System.out.println("------------------------------------------");

        // reversed

        for (int i = numbers.size() -1;   i >= 0 ; i--) {
            System.out.println(   numbers.get(i)        ); // 60 ~ 10
        }


        System.out.println("--------------------------------------------");


        // shortcut : numbers.fori
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(  numbers.get(i) );
        }

        System.out.println("--------------------------------------------");

        // shortcut for reverse : numbers.forr
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println( numbers.get(i)  );
        }



    }

}
