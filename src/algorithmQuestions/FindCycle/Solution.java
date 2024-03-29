package algorithmQuestions.FindCycle;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        System.out.println(hasCycle(n1));
    }

    public static boolean hasCycle(ListNode head) {
        //create a HashSet for nodes

        HashSet<ListNode> nodeList = new HashSet<>();

        ListNode current = head;

        while (current.next != null){

            if (nodeList.contains(current)) return true;

                nodeList.add(current);

                current = current.next;
        }



        return false;

    }
}
