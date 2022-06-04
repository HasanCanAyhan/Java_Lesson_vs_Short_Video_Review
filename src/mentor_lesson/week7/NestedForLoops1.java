package mentor_lesson.week7;

public class NestedForLoops1 {

    public static void main(String[] args) {


        for (int i = 5; i >= 1 ; i--) {

            for (int j = 1;  j <= i  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        // Another Solution

        // If we change  j<=i to j<6-i (“6-i” is number of rows)

        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j <= 6-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }




    }
}
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */