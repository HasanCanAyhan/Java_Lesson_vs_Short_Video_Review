package mentor_lesson.week29.implementQueueUsingStacks;

import java.util.Stack;

public class QueueOperationsUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int num){
        stack1.push(num);
    }

    int dequeue(){
        peek();
        return stack2.pop();
    }

    boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    int peek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public static void main(String[] args) {

        QueueOperationsUsingStacks q = new QueueOperationsUsingStacks();

        q.enqueue(1);
        q.enqueue(2);

        System.out.println();
        System.out.println("-------------------");

        System.out.println(q.dequeue());//1
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.isEmpty());

        q.enqueue(5);
        System.out.println(q.dequeue());//2

        q.enqueue(6);
        System.out.println(q.peek()); // 3


    }


}
