package java_short_video.collection.queueDemo;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        // Duplicates are allowed
        // Insertion order not preserved
        // First-in, First-out order(FIFO)

        // PriorityQueue, ArrayDeque, LinkedList

        /*
        PriorityQueue Class :
            - maintains the random order
            - does NOT accept Null values

        ArrayDeque:
            - maintains the insertion order
            - accepts null values

         */

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        Queue<Integer> arraydeque = new ArrayDeque<>();
        arraydeque.addAll(Arrays.asList(10,200,300,40,90));

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue); // does not keep insertion order
        System.out.println("arraydeque = " + arraydeque);  // keeps insertion order
        System.out.println("linkedList = " + linkedList); // keeps insertion order


        System.out.println("--------------------------------------");

        // First - In , First - Out
        priorityQueue.poll();
        arraydeque.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue); //[40, 90, 300, 200]
        System.out.println("arraydeque = " + arraydeque);  // [200, 300, 40, 90]
        System.out.println("linkedList = " + linkedList); // [200, 300, 40, 90]


        System.out.println("--------------------------------------");

        // First - In , First - Out
        priorityQueue.poll();
        arraydeque.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue); //[90, 300, 200]
        System.out.println("arraydeque = " + arraydeque);  // [300, 40, 90]
        System.out.println("linkedList = " + linkedList); // [300, 40, 90]

        System.out.println("--------------------------------------");

        System.out.println(  ((LinkedList)linkedList).get(2)  ); // 90
        //                     downcasting, because reference type : queue

        System.out.println("--------------------------------------");

        for (Integer each : priorityQueue) {
            System.out.println(each);
        }




    }
}
