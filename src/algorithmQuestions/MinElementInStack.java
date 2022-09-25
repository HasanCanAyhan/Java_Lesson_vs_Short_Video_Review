package algorithmQuestions;

import java.util.Stack;

//https://youtu.be/c_mjlnOhHT4
public class MinElementInStack {

    public static void main(String[] args) {

        //How to find minimum element of stack

        /*
        MinElementInStack stack = new MinElementInStack();
        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(12);
        stack.push(2);
         */

        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(10);
        originalStack.push(5);
        originalStack.push(20);
        originalStack.push(12);
        originalStack.push(2);

        Stack<Integer> minStack = new Stack<>();
        // 10 5 20 12 2


        minStack.push(originalStack.get(0)); // 10
        int i = 0;
        while (i <= originalStack.size() -1 ) {

            if (originalStack.get(i) < minStack.peek()){
                minStack.pop();
                minStack.push(originalStack.get(i));
            }

            i++;


        }


        System.out.println("minStack = " + minStack); // 2 5 10
    }

}
