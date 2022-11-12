package mentor_lesson.week26.palindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

//https://youtu.be/Ll9ZbXaXqlQ

public class Solution {

    public boolean isPalindrome(ListNode head) {

        // O(n)

        if (head == null || head.next == null) return true; // if null or one element

        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = list.size()-1;

        while (start < end){
            if (list.get(start) != list.get(end)) return false;
            start++;
            end--;
        }

        return true;

    }

    public boolean isPalindrome2(ListNode head){

        //O(1)

        //find mid
        //reverse one of them
        //compare both each other

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;

        ListNode revHead =  reverse(slow);

        while (revHead != null){
            if (revHead.val != head.val) return false;
            revHead = revHead.next;
            head = head.next;
        }

        return true;

    }


    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null ){
            ListNode next = head.next;
            head.next = prev;
            prev = head;//prev becomes head
            head = next;
        }

        return prev; // bcs prev is head

    }


}
