package mentor_lesson.week7;

public class NestedForLoops {

    public static void main(String[] args) {


        // j<=5 to j<=i


        for (int i = 1; i <= 5 ; i++) {

            System.out.print("* ");

            for (int j = 1; j < i  ; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }



    }

}
