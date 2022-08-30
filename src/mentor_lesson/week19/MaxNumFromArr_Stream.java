package mentor_lesson.week19;

import java.util.Arrays;

public class MaxNumFromArr_Stream {

    public static void main(String[] args) {

        int[] arr = {6, 8, 3, 5, 1 ,9};

        maxNum(arr);

    }

    private static void maxNum(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }

}
