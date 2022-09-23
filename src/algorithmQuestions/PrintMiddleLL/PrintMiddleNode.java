package algorithmQuestions.PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 1; i <= 9; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList sll) {

        //FOR ODD NUMBER
        // H                                       T
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 ->null  output : 5
        //                     s
        //                                         f

        //FOR EVEN NUMBER
        // H                                  T
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 ->null  output : 4 - 5
        //                s
        //                               f


        Node slow = sll.head;
        Node fast = sll.head;

        while (fast != sll.tail && fast.next != sll.tail){

            slow = slow.next;
            fast = fast.next.next;

        }
        if (fast == sll.tail) System.out.println(slow.id);
        else System.out.println(slow.id + " - " + slow.next.id);





    }

}
