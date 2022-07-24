package java_short_video.ternaries;

public class Ternaries {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        int result = (a > b)? a : b;
        System.out.println(result);

        System.out.println("---------------------------");


        int score = 90;

        char result1 = (score >= 90 ) ? 'A' :(score >= 80) ? 'B' :(score >= 70)? 'C' :(score > 60)? 'D' : 'F';

        System.out.println(result1);


    }


}
