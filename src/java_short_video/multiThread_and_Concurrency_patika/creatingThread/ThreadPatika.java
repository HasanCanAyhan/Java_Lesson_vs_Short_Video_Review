package java_short_video.multiThread_and_Concurrency_patika.creatingThread;

public class ThreadPatika {

    public static void main(String[] args) {

        /*
        System.out.println("Started");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Ended");


         */

        Counter c1 = new Counter("Counter-1");


        Counter c2 = new Counter("Counter-2");

        // 2 islem parcacıgı

        c1.start(); // start() : in order to run Thread
        c2.start();




    }

}
