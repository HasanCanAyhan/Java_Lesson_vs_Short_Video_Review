package mentor_lesson.week22;

import java.util.Objects;

public class MyLinkedList {

    ListNode head;

    private void removeDup(ListNode head) {

        ListNode current = head;

        while (Objects.nonNull(current) && Objects.nonNull(current.next)) {
           // System.out.println(current.data);
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }


        }


    }

    private void show(ListNode head) {

        ListNode current = head;
        while (Objects.nonNull(current)) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");

    }

    public static void main(String[] args) {


        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(4);
        ListNode seventh = new ListNode(5);
        ListNode eight = new ListNode(6);
        ListNode ninth = new ListNode(6);

        

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

        System.out.println("--------------------------------");


        list.removeDup(list.head);

        list.show(list.head);


    }


}