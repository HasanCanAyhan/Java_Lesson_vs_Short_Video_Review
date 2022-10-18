package algorithmQuestions.ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        for(int i=0;i<10;i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }
     static void reverse(MySinglyLinkedList list) {

         // 1 -> 2 -> 3 -> 4 -> 5 -> null
   // prev                      ^
   // current                         ^
   // nextN                                ^

         ListNode prev = list.head;
         ListNode current = list.head.next;

         while (current != null){

             ListNode holdingThirdNode = current.next;
             current.next = prev;
             prev = current;
             current = holdingThirdNode;

         }

         list.tail = list.head;
         list.head = prev;
         list.tail.next = null;


     }
}
