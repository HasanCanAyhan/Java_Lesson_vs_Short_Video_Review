package java_short_video.exceptions_and_errorsIntro;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        Integer[] arr = {10,20,30};

        //System.out.println(  arr[20]  ); // unchecked exceptions : ArrayIndexOutOfBoundsException

        //System.out.println("Hello");


        //System.out.println("Java".charAt(-1)); // unchecked exception : StringIndexOutOfBoundsException

        String str = null;

        System.out.println(str.toUpperCase()); // unchecked exception : .NullPointerException


        System.out.println("--------------------------------------------------------------");


        //Thread.sleep(3000); // checked exception - Unhandled exception: java.lang.InterruptedException

        //FileInputStream file = new FileInputStream("file path");// checked exception - Unhandled exception: java.io.FileNotFoundException
        // we can not run my code


        // Errors can not be recovered!! we can not handle it!! But Exceptions we can handle it!!

    }

}
