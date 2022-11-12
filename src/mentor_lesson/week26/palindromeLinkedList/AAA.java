package mentor_lesson.week26.palindromeLinkedList;

public class AAA {


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

        while (head != null){

            ListNode holdingThirdNode = head.next;
            head.next = prev;
            prev = head;
            head = holdingThirdNode;

        }


        return prev; // bcs prev is head

    }
}
