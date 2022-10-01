package mentor_lesson.week23.linkedListCycleDetection;

import java.util.HashSet;

public class Main {

    ListNode head;

    public static void main(String[] args) {

        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(8);
        listNode.next.next = new ListNode(7);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = listNode;

        // 4 8 7 2 ->> null
        //   ^

        System.out.println(detectCycle(listNode).val);


    }


    static ListNode detectCycle(ListNode head) {

        ListNode prev = head;
        ListNode current = head;

        // 3->2->0->4
      // p ^
     // c        ^


        HashSet<ListNode> setList = new HashSet<>(); // 3 2 0 4

        while (current.next != prev && current.next != null) {

            if(!setList.add(current)){
                return current;
            }
            /*
            if (!setList.contains(current)) {
                var n = setList.add(current);
            } else {
                return current;
            }

             */

            current = current.next;
        }


        if (current.next!= null && current.next.val == prev.val){

            return prev;

        }else{
            System.out.println("null");
            return new ListNode(0);
        }



    }


}
