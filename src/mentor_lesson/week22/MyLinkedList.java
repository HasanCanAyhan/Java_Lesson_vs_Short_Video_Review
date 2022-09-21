package mentor_lesson.week22;

import java.util.Objects;

public class MyLinkedList {

    Node head;

    private void removeDup(Node head) {

        Node current = head;

        while (current.next != null) {
           // System.out.println(current.data);
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }


        }


    }

    public static void deleteDuplicates(Node head) {
        if (head == null || head.next == null) return;
        Node slow = head;
        Node fast = head.next;
        while (fast != null) {
            if (slow.data == fast.data) {
                fast = fast.next;  //  1  1  1  2   2
                slow.next = fast;  //               f
            } else {                //          s
                slow = fast;
                fast = fast.next;
            }
        }
    }

    private void show(Node head) {

        Node current = head;
        while (Objects.nonNull(current)) { // current != null
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");

    }

    public static void main(String[] args) {


        Node first = new Node(1);
        Node second = new Node(1);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(4);
        Node sixth = new Node(4);
        Node seventh = new Node(5);
        Node eight = new Node(5);
        Node ninth = new Node(6);

        

        MyLinkedList list = new MyLinkedList();
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = ninth;



        list.show(list.head);

        //1 -> 1 -> 3 -> 4 ->

        System.out.println("--------------------------------");


        list.removeDup(list.head);

        list.show(list.head);


    }


}