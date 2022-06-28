package java_short_video.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods_Part2 {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>(); // it accepts String objects

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");


        // contains(element) : checks if Array list contains the given element, return type is boolean

        // Apple

        boolean r1 = groceryList.contains("Apple");
        System.out.println(r1); // true

        System.out.println("-----------------------------------------------------------------------");

        // equals(list) : checks if the ArrayList is equal to the given list, return type is boolean

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Banana");
        list1.add("Apple");
        list1.add("Cheese");
        list1.add("Soy Sauce");
        list1.add("Salt");
        list1.add("Sugar");


        boolean r2 = list1.equals(groceryList);
        System.out.println(r2); // true--- >> same elements

        System.out.println("-----------------------------------------------------------------------");

        // isEmpty() : checks if the ArrayList is empty(size is 0), return type is boolean

        boolean r3 = groceryList.isEmpty();

        System.out.println(r3); // false

        System.out.println("-----------------------------------------------------------------------");





        // BULK OPERATIONS**** COLLECTION TYPE


        ArrayList<Integer>  numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // containsAll(CollectionType) : checks if the ArrayList contains all the given collection of values, return type is boolean


        boolean r4 = numbers.containsAll( Arrays.asList(10,20,30,40) );

        System.out.println(r4); // true

        boolean r5 = numbers.containsAll( Arrays.asList(10,20,30,40,100) );

        System.out.println(r5); // false because there is no 100 in the list

        System.out.println("-----------------------------------------------------------------------");

        // addAll(CollectionType) : adds all the given collection of values to the ArrayList

        System.out.println(numbers); // [10, 20, 30, 40, 50, 60]
        numbers.addAll( Arrays.asList(70,80,90,95,100)   ); // at the same time
        System.out.println(numbers); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 95, 100]

        System.out.println("-----------------------------------------------------------------------");

        // removeAll(CollectionType) : removes all the matching values from the ArrayList

        numbers.removeAll(  Arrays.asList(10,50,80)   );
        System.out.println(numbers);// [20, 30, 40, 60, 70, 90, 95, 100]


        System.out.println("-----------------------------------------------------------------------");

        // retainAll(CollectionType) : removes all the un-matching values from the Arraylist.(keeps the matching values only)

        // i want to keep 20 , 40 ,70

        numbers.retainAll(   Arrays.asList( 20,40,70  )  ); // asList : hold the multiple values
        System.out.println(numbers); // [20, 40, 70]


    }


}
