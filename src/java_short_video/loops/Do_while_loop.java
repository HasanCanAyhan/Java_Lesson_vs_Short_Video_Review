package java_short_video.loops;

public class Do_while_loop {

    public static void main(String[] args) {


        /* Syntax

        do{

            // Loop Body

            Statement(s)

        }while(Boolean Expression);

         */

        int i = 0;
        do {

            System.out.println("Hello");

        }while(i > 5);


        System.out.println("------------------------------------");

        while(i>5){ // false  int i = 0
            System.out.println("Hello"); // never will be executed

        }


        System.out.println("--------------------------------------------");

        do {
            System.out.println("Hello");
            i++;
        }while(i<5);




    }

}
