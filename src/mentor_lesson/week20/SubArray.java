package mentor_lesson.week20;

public class SubArray {

    public static void main(String[] args) {

        int[] arr = {1,9,-1,-2,7,3,-1,2};

        int k = 4; // size


        int max = 0;

        //                      8 - 4
        for (int i = 0; i < arr.length - k ; i++) {

            int sum = 0;
            for (int j = i ; j < i+k ; j++) {

                sum += arr[j];
            }

            if (sum > max){
                max = sum;
            }


        }

        System.out.println("max = " + max);


    }



}
