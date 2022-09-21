package mentor_lesson.week22;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,0,7};
        //   p1          ^
        //   p2                ^

        int pointer1 = 0;
        int pointer2 = 0;


        if(arr[pointer1] != 0){
            for (int i = 0; i < 2 ; i++) {
                pointer2++;
            }
            pointer1++;
        }else{
            pointer2++;
        }


        while (pointer2 <= arr.length-1 ){


            if (arr[pointer1] == 0 && arr[pointer2] != 0){
                swap(arr,pointer2,pointer1);
                pointer1++;
            }


            pointer2++;



        }

        System.out.println(Arrays.toString(arr));



    }

    private static void swap(int[] arr, int pointer2, int pointer1) {

        int temp = arr[pointer2];
        arr[pointer2] = arr[pointer1];
        arr[pointer1] = temp;

    }


}
