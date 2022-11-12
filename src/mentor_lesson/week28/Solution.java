package mentor_lesson.week28;

public class Solution {

    public static void printList(Node head) {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.val + " —> ");
            current = current.next;
        }

        System.out.println("null");
    }


    public static Node deleteNAfterMNodes(Node head, int m, int n){

        if (head == null || head.next == null) {
            return head;
        }

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10  : output -->> 1 —> 5 —> 9 —> null m:1 n:3
        // p
        //    c

        Node tmp1 = head;
        Node tmp2 = head;

        int i = 0, j = 0;

        while(i++ < m - 1) {
            tmp1 = tmp1.next;
        }

        tmp2 = (m == 0) ? tmp1 : tmp1.next;

        while(j++ < n) {
            if(tmp2 == null) {
                System.out.println("Not enough elements to delete");
                return head;
            }
            tmp2 = tmp2.next;
        }

        if(m == 0) {
            return tmp2;
        } else {
            tmp1.next = tmp2;
        }

        deleteNAfterMNodes(tmp2,m,n);

        return head;

    }


    public static void main(String[] args) {


        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = deleteNAfterMNodes(head, 1, 3);
        printList(head);


    }

}
