package algorithmQuestions;

public class Contiguous_Subarray_TwoPointer {

    public static void main(String[] args) {


        int[] arr = {1,9,-1,-2,7,3,-1,2};

        int k = 4; // size


        int maxSum = 0;

        for (int i = 0; i < arr.length - k  ; i++) {

            int sum_subArr = 0;

            for (int j = i; j < i + k ; j++) {
                sum_subArr += arr[j];
            }

            maxSum = Math.max(maxSum,sum_subArr);


        }


        System.out.println("maxSum = " + maxSum);

    }





}
