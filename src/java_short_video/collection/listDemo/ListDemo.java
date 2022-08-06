package java_short_video.collection.listDemo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5));
        //arrayList.addAll(Arrays.asList(1,2,3,4,5));


        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5));
        //linkedList.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1,2,3,4,5));
        //vector.addAll(Arrays.asList(1,2,3,4,5));


        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5));
        //stack.addAll(Arrays.asList(1,2,3,4,5)); // duplicated


        System.out.println("arrayList = " + arrayList);
        System.out.println("linkedList = " + linkedList);
        System.out.println("vector = " + vector);
        System.out.println("stack = " + stack);


        System.out.println("ArrayList : ");
        for (int i = 0; i < arrayList.size(); i++) { // linkedList, vector

            System.out.print(arrayList.get(i) + " ");

        }

        System.out.println();
        System.out.println("---------------------------------");

        for (Integer each : arrayList) {
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("-----------------------");

        // stack -->> pop()

        System.out.println(stack); // [1, 2, 3, 4, 5]

        ((Stack)stack).pop(); // downcasting, because reference type is List and in List there is no pop() method
        // last element will be removed
        System.out.println(stack); // [1, 2, 3, 4]




    }

}
