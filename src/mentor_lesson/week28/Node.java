package mentor_lesson.week28;

public class Node {
    int val;
    Node next;

    public Node(int id) {
        this.val = id;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
