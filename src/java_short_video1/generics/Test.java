package java_short_video1.generics;

import java_short_video.OOPAbstraction.Interface.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //method

        Integer[] numbers = {1,2,3,4,5,6};
        Double[] decimals = {1.5,2.5,3.5,4.5};
        String[] names = {"Java", "Selenium", "SQL"};
        Shape[] shapes = {null, null};

        /*
        Generics.printEach(numbers);
        System.out.println("-------------------------");
        Generics.printEach(decimals);
        System.out.println("-------------------------");
        Generics.printEach(names);
        System.out.println("-------------------------");
        Generics.printEach(shapes);

         */

        System.out.println("----------------------");


        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //Generics.printEach(scores);

        System.out.println("------------------------------");

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Can","John","Edu"));

        //Generics.printEach(namesList);

        //class
        Generics<Integer> obj1 = new Generics<>();
        obj1.printEach(scores);

        Generics<String> obj2 = new Generics<>();
        obj2.printEach(namesList);

        System.out.println("----------------------------");

        //interface : ex : List

        //List<Integer>


    }

}
