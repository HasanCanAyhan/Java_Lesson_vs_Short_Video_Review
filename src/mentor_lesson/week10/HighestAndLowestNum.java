package mentor_lesson.week10;

import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowestNum {

    public static void main(String[] args) {

        String str = "1 2 3 4 5 ";


        String[] arr = str.split(" ");


        ArrayList<Integer> list = new ArrayList<>();

        for (String each : arr) {

            list.add(Integer.valueOf(each));//*****

        }



        int max = Collections.max(list);
        int min = Collections.min(list);

        String result = max + " "+ min;

        System.out.println(result);

    }




}
