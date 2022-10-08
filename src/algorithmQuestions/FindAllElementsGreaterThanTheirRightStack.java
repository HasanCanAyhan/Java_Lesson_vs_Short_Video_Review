package algorithmQuestions;

import java.util.Stack;

public class FindAllElementsGreaterThanTheirRightStack {

    /*
    Find all elements in an array that are greater than all elements to their right
    Given an unsorted integer array, print all greater elements than all elements present to their right.

    For example, consider the array [10, 4, 6, 3, 5]. The elements that are greater than all elements to their right are 10, 6, and 5.
     */


    public static void main(String[] args) {

        int[] arr = { 10, 4, 6, 3, 5 };
        //int[] arr = {2, 4, 6, 3, 5, 10};
        find(arr);

        //output = 10 , 6 , 5

    }
    public static void find(int[] arr){

        //Base case
        if (arr == null || arr.length == 0) return;

        Stack<Integer> stack = new Stack<>();//empty stack


        for (int value : arr) {

            //pop all the elements that are less than the current element

            while (!stack.isEmpty() && stack.peek() < value){
                stack.pop();
            }

            stack.push(value);

        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }


    }



}
