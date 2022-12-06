package mentor_lesson.week33;

import java.util.Arrays;
import java.util.Stack;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr1 = {9,6,4,2,3,5,7,0,1}; // ->> 8
        //int[] arr1 = {3,0,1}; //-->> 2
        //int[] arr1 = {0,1};
        int n = arr1.length;
        System.out.println(findMissingNumber(arr1,n));

    }

    public static int findMissingNumber(int[] arr, int n){

        Arrays.sort(arr);

        int[] arr2 = new int[n+1];

        for (int i = 0; i < n+1 ; i++) {
            arr2[i] = i;
            if (i < arr.length){
                if (arr2[i] != arr[i]){
                    return i;
                }
            }else {
                arr2[i] = i;
                return i;
            }


        }

        return -1;

    }

}
