package java_short_video.Throws_and_ThrowKeyword;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{ // fastes way to handling checked exceptions

        // only used to handle checked exception

        // you do not need to write try&catch blocks again gain by helping of throws

        // checked exception


        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("World");

        Thread.sleep(4000);

        System.out.println("How are you?");


        //System.out.println(100/0); error still continue

        sleep5Seconds();



    }

    public static void sleep5Seconds() throws InterruptedException {

        Thread.sleep(5000);
    }

    public static void Test(){

        try {
            sleep5Seconds();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
