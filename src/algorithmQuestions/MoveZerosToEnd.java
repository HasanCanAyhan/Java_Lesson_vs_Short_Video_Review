package algorithmQuestions;

import java.util.Arrays;

public class MoveZerosToEnd { //my solution

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,0,7};
        //           1 2 7 0 0 0
        //   s           ^
        //   f                  ^

        int slow = 0;
        int fast = 0;

        while (fast < arr.length-1){

            if (arr[slow] != 0){
                slow++;
            }

            if (arr[fast] == 0 || fast <= slow){
                fast++;
            }

            if (arr[slow] == 0 &&  arr[fast] != 0){
                swap(arr,fast,slow);
            }


        }




        System.out.println(Arrays.toString(arr));



    }

    private static void swap(int[] arr, int fast, int slow) {

        int temp = arr[fast];
        arr[fast] = arr[slow];
        arr[slow] = temp;

    }


}
