package java_short_video.array;

import java.util.ArrayList;

public class ArrayListMethods_Part1 {


    public static void main(String[] args) {


        /*
        add - size - get - set - remove - clear - indexOf - lastIndexOf - contains - equals
        isEmpty - containsAll - addAll - removeAll - retainAll
         */

        ArrayList<String> groceryList = new ArrayList<>(); // it accepts String objects

        // add() : adds element into the arraylist, size will be increased by 1

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        System.out.println(groceryList); // [Banana, Apple, Cheese, Soy Sauce, Salt, Sugar]

        System.out.println("---------------------------------------------------------------------");

        //size() : returns the total number of elements of the arraylist , return type is int

        int a = groceryList.size();
        System.out.println(a); //6

        System.out.println("---------------------------------------------------------------------");

        //get(index) : returns the element at the given index from the arrayList

        System.out.println(groceryList.get(1)); // Apple

        System.out.println("---------------------------------------------------------------------");

        // set(index, newElement) : replaces the element of the arrayList at the given index to the new element

        // Cheese
        groceryList.set(2, "Eggs");
        System.out.println(groceryList); // [Banana, Apple, Eggs, Soy Sauce, Salt, Sugar]

        System.out.println("---------------------------------------------------------------------");

        // remove(int index) : removes the element at the given index from the ArrayList, size will be decreased

        //Soy Sauce

        groceryList.remove(3);
        System.out.println(groceryList);// [Banana, Apple, Eggs, Salt, Sugar]

        System.out.println("---------------------------------------------------------------------");

        // remove(Object) : removes the given object from the ArrayList(first matching), and returns boolean

        boolean r1 = groceryList.remove("Apple");
        System.out.println(groceryList); // [Banana, Eggs, Salt, Sugar]

        System.out.println(r1); // true

        System.out.println("---------------------------------------------------------------------");

        // clear(): removes all the objects from ArrayList, size will be set to zero

        groceryList.clear();
        System.out.println(groceryList); // []-empty array- size 0;


        System.out.println("---------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(20); // 2
        numbers.add(20); // 3
        numbers.add(30); // 4
        numbers.add(40); // 5
        numbers.add(10); // 6

        // indexOf(element) : returns the index number of the first matching element from the ArrayList, return type is int

        int b = numbers.indexOf(20);

        System.out.println(b);// 1 - first matching

        // lastIndexOf(element) : returns the index number of the last matching element from the ArrayList, return type is int

        int c = numbers.lastIndexOf(20);

        System.out.println(c); // 3


        int d = numbers.indexOf(10);
        System.out.println(d); // 0
        int e = numbers.lastIndexOf(10);
        System.out.println(e); // 6

    }


}
