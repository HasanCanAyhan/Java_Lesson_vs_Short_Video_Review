package mentor_lesson.week7;

public class NestedForLoops7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {

            for (int k = 1; k < i ; k++) {
                System.out.print(" ");
            }

            for (int j = 6-i; j >= 1 ; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }



    }

}
/*
5 4 3 2 1
 4 3 2 1
  3 2 1
   2 1
    1
 */