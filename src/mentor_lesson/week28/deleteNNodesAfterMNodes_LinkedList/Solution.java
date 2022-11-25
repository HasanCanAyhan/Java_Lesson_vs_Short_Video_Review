package mentor_lesson.week28.deleteNNodesAfterMNodes_LinkedList;

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

        if (head == null) return null;

        Node curr = head;
        Node prev= head;

        while (curr != null) {
            int k = 0;
            for (int i = 1; i <= m; i++) { // m = 2
                if (k < m - 1) {
                    prev = prev.next;
                    k++;
                }
                curr = curr.next;
            }

            for (int i = 1; i <= n; i++) { // 3
                if (curr != null){
                    curr = curr.next;
                }
            }

            prev.next = curr;
            prev = curr;

        }

        return head;

    }


    public static void main(String[] args) {


        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13 };

        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = deleteNAfterMNodes(head, 2, 3);
        printList(head);


    }

}
