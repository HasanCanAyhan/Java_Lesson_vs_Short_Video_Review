package java_short_video.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {


        /*

        Collections : Utility class of the Collection.
                      presented in "java.util" package

            methods:

            sort(list) : sorts the list in ascending order
            max(list) : returns the max number
            min(list) : returns the min number
            reverse(list) : reverses the list
            swap(list1,index1,index2) : swaps the elements at the given indexes
            frequency(list, element) : returns the frequency of the element from the list
            replaceAll() : all occurences of a specified element in a list with a new list


         */


        //   sort(list) : sorts the list in ascending order

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,50,150,10,20,30,40,50,60,70) );


        Collections.sort(numbers);

        System.out.println(numbers); // [10, 20, 30, 40, 50, 50, 60, 70, 100, 150, 200]

        System.out.println("------------------------------------------------------------");


        //   max(list) : returns the max number
        //   min(list) : returns the min number

        Integer max = Collections.max(numbers);
        System.out.println(max); // 200

        Integer min = Collections.min(numbers);
        System.out.println(min); // 10


        System.out.println("------------------------------------------");

       //  reverse(list) : reverses the list

        Collections.reverse(numbers);

        System.out.println(numbers); // [200, 150, 100, 70, 60, 50, 50, 40, 30, 20, 10]

        System.out.println("---------------------------------------------------------");


        //  swap(list1,index1,index2) : swaps the elements at the given indexes


        Collections.swap(numbers,1,2);

        System.out.println(numbers); // [200, 100, 150, 70, 60, 50, 50, 40, 30, 20, 10]

        //----------------------

        Collections.swap(numbers,0, numbers.size()-1);
        //                                last index
        System.out.println(numbers); // [10, 100, 150, 70, 60, 50, 50, 40, 30, 20, 200]


        System.out.println("-----------------------------------------------------------");

        // frequency(list, element) : returns the frequency of the element from the list

        int count = Collections.frequency(numbers,50);

        System.out.println(count); // 2



    }


}
