package mentor_lesson.week26.palindromeLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);

        list.head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;


    }
     public static boolean isPalindrome(ListNode head) {

         // 1 -> 2 -> 3 -> 4 -> 5 -> null
   // prev                      ^
   // current                         ^
   // nextN                                ^

         ListNode start = head;

         ListNode prev = head;
         ListNode current = head.next;

         while (current != null){

             ListNode holdingThirdNode = current.next;
             current.next = prev;
             prev = current;
             current = holdingThirdNode;

         }

         ListNode tail = head;
         head = prev;
         tail.next = null;


         while (start != null){

             if (start.val != prev.val){
                 return false;
             }

             prev = prev.next;
             start = start.next;
         }

         return true;


     }






}
