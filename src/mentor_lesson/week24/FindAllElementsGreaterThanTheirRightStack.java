package mentor_lesson.week24;

import java.util.Stack;

public class FindAllElementsGreaterThanTheirRightStack {

    public static void main(String[] args) {

        //int[] arr = { 10, 4, 6, 3, 5 };
        int[] arr = {10, 4, 6, 3, 5, 2};
        find(arr);

        //output = 10 , 6 , 5

    }
    public static void find(int[] arr){

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]); // 0 : 10 ,4

        for (int i = 1; i < arr.length; i++) {

            if(!stack.isEmpty() && arr[i] < stack.peek() ){
                    stack.push(arr[i]);
            }

            while (!stack.isEmpty() && arr[i] > stack.peek()){
                stack.pop();
                stack.push(arr[i]);
            }

        }


        System.out.println(stack);


    }



}
