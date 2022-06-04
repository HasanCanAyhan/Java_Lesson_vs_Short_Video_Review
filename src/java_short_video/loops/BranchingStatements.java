package java_short_video.loops;

public class BranchingStatements {

    public static void main(String[] args) {

        // break _ vs _ continue

        // 1. Break Statement : Terminate;Exit the loop

        for (char i = 'A';   i <= 'E' ; i++){

            System.out.println(i);  // A B C

            if( i == 'C'){
                break; // exits the loop --->> the rest of character will not be executed
            }

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i <= 5 ; i++) {

            System.out.println(i); // 1 2 3

            if(i == 3){
                break;
            }

        }


        System.out.println("-------------------------------------------------------");

        // 2. Continue Statement :

        for (char i = 'A';   i <= 'E' ; i++){

            if(i == 'C'){
                break;
            }

            System.out.println(i); // A B

        }


        System.out.println("-----------------------");

        for (char i = 'A';   i <= 'E' ; i++){

            if(i == 'C'){
                continue; // skips the C
            }

            System.out.println(i); // A B D E

        }





    }


}
