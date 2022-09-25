package algorithmQuestions.a_java_interview_coding_tasks_byMuhtar.array_tasks;

public class FindSubAArraySumClosestTo0 {

    /* Another Question : Find the Sub-array with sum closest to 0
    Input : arr[] = {-1, 3, 2, -5, 4}
    Output : 1, 3
    Subarray from index 1 to 3 has sum closest to 0 i.e.
    3 + 2 + -5 = 0

    Input : {2, -5, 4, -6, 3}
    Output : 0, 2
    2 + -5 + 4 = 1 closest to 0
         */

    public static void main(String[] args) {

        int arr[] = {2, -5, 4, -6, -3};
        //int[] arr = {-1, 3, 2, -5, 4};
        //              0  1  2   3  4
        //              ^
        //                 ^

        System.out.println(getSubArray(arr));

    }

    public static String getSubArray(int[] arr) {

        int z = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) { // i =0
            for (int j = i + 1; j < arr.length; j++) { // j=1
                int temp = j;//1                         line 34-40 : to find sub Array
                int sum = arr[i];//-1
                //      1 > 0
                while (temp > i) {
                    sum += arr[temp]; // 0
                    temp--;
                }


                if (z == 0) {
                    z = sum; //z = 2
                }

                //    0 < 2
                if (Math.abs(sum) < Math.abs(z)) {
                    z = sum; // 0
                    result += i + "," +j + "\n";
                    break;



                }


            }


        }

        return result;

    }

}
