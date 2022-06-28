package java_short_video.array;

public class IteratingArrayWithForLoop {

    public static void main(String[] args) {


        int[] numbers = {10,20,30,40,50,60,70,80};
        //indexes:        0  1  2  3  4

        /*
        System.out.println( numbers[0] );
        System.out.println( numbers[1] );
        System.out.println( numbers[2] );
        System.out.println( numbers[3] );
        System.out.println( numbers[4] );
         */

        //                             5 - 1
        for(int i = 0; i <= numbers.length-1 ; i++){
            System.out.println(  numbers[i]  );
            //                   arrayName[index]
        }

        System.out.println("-----------------------------");


        for (int i = numbers.length - 1; i >= 0; i--) {

            System.out.println(numbers[i]);
        }

        System.out.println("----------------------");


        String[] colors = {"Yellow","Red","White","Blue","Green","Black"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("----------------------");

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }


    }

}
