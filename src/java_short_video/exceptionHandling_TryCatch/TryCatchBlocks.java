package java_short_video.exceptionHandling_TryCatch;

public class TryCatchBlocks {

    public static void main(String[] args) {

        try {

            System.out.println(9 / 0);
            System.out.println("try block");

        }catch (RuntimeException e){ // parent of unchecked exceptions

            e.printStackTrace(); // more preferred
            //System.out.println(e.getMessage());
            System.out.println("catch block");
            //System.exit(0);
        }finally {
            System.out.println("Finally block");
        }

        System.out.println("Hello"); // it is executed








    }


}
