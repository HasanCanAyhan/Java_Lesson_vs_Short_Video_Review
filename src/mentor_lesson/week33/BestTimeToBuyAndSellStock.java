package mentor_lesson.week33;

import java.util.Stack;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {


        //int[] arr = {7,1,5,3,6,4}; // -->> output : 5
        int[] arr = {7,6,4,3,1};
        System.out.println(findBestTimeToBuyAndSellStock(arr));

    }

    public static int findBestTimeToBuyAndSellStock(int[] arr){

        Stack<Integer> stack  = new Stack<>();
        stack.push(arr[0]);

        int i = 1;
        int max = 0;
        while (stack.size() > 0 && i < arr.length -1){

            if (arr[i] < stack.peek()){
                Integer pop = stack.pop();
                if (max < arr[i] - pop ){
                    max = arr[i] - pop;
                }
                stack.push(arr[i]);
                i++;
            }else{
                if (max < arr[i] - stack.peek() ){
                    max = arr[i] - stack.peek();
                }

                i++;
            }

        }

        return max;
    }

}
