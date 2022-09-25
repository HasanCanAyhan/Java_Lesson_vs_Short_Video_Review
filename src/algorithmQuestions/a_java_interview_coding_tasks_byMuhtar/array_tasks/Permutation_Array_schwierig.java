package algorithmQuestions.a_java_interview_coding_tasks_byMuhtar.array_tasks;

public class Permutation_Array_schwierig {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        getPermutation(arr,0);
    }
    private static void printArray(int[] arr) {
        //123 ,
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void getPermutation(int[] arr, int currentId) {

        //123
        if (currentId == arr.length-1){
            printArray(arr);
            return;
        }

        for (int i = currentId; i < arr.length; i++) {

            swap(arr,i, currentId);
            getPermutation(arr,currentId+1);
            swap(arr,i,currentId);


        }



    }




}
