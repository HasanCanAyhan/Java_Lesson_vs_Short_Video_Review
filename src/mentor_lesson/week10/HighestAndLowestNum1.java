package mentor_lesson.week10;

public class HighestAndLowestNum1 {

    public static void main(String[] args) {





    }

    public static String highAndLowNum(String str){

        String[] strings = str.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String each : strings) {

            int num = Integer.parseInt(each); //*****

            min = Math.min(num,min);

            max = Math.max(num,max);

        }


        return max + " " + min;

    }

}
