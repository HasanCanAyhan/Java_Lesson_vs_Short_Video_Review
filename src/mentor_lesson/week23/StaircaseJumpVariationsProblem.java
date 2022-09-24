package mentor_lesson.week23;

public class StaircaseJumpVariationsProblem {

    public static void main(String[] args) {


       int n = 7;

        System.out.println(variation(n)); // 13

    }

    public static int variation(int n){

        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        return variation(n-1) + variation(n-2)+ variation(n-3);


    }



}
