package java_short_video.loops;

public class While_loop {

    public static void main(String[] args) {

        // print 1 ~ 10

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(" Hello " +i);
        }

        System.out.println();

        System.out.println("--------------------------");



        int i = 1;
        while( i <= 10 ){
            System.out.print(" Hello " + i);
            i++; // iteration : after the statement
        }

        System.out.println();
        System.out.println("--------------------------");
        i = 1;
        while( i <= 10 ){

            i++;
            System.out.println(i);
        }



    }

}
