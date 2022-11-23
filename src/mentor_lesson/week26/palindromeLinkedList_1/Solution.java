package mentor_lesson.week26.palindromeLinkedList_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://youtu.be/Ll9ZbXaXqlQ

public class Solution {


    public boolean isPalindrome_usingStack(ListNode head) {

        //using stack

        if (head == null) return false;

        Stack<Integer> stack = new Stack<>();

        ListNode curr = head;

        while (curr != null){

            stack.push(curr.val);

            curr = curr.next;

        }

        curr = head;

        while (stack.size() > 0 && curr != null){

            Integer pop = stack.pop();

            if (pop != curr.val) return false;

            curr = curr.next;
        }

        return true;

    }

    public boolean isPalindrome_reverseLinkedList(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        //find middle
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow 6 , fast at the end 1

        //reverse
        ListNode prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }// prev at the end now as reversed

        fast = head; //at the start
        slow = prev;
        while (slow != null){
            if (slow.val != fast.val) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return true;

    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(6);
        ListNode fifth = new ListNode(3);
        ListNode sixth = new ListNode(8);
        ListNode seventh = new ListNode(1);

        ListNode head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;


        System.out.println( solution.isPalindrome_usingStack(head) );

        System.out.println("-------------------------------------------");

        System.out.println(solution.isPalindrome_reverseLinkedList(head));

    }


}
