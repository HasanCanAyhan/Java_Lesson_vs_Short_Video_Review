package java_lab.lab12_oop_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {

    public static void main(String[] args) throws FileNotFoundException {

        String str = null;

        try {
           String result =  str.repeat(3); // after this lne jumped to catch block
            System.out.println(result);
            System.out.println("Try Block");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Catch Block");
            // alternative solution

            str = "Java";

            String result = str.repeat(3);
            System.out.println(result);
        }


        System.out.println("----------------------------------------");

        /*
        try {
            new FileInputStream("pdf.txt"); // checked exception : throws or try&catch
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


         */


        new FileInputStream("pdf.txt");


    }

    public  void method1() throws FileNotFoundException {
        new FileInputStream("pdf.txt");
    }

    public void method2(){
        //method1();
    }

    public void method3(){ // permanent solution

        try {
            new FileInputStream("pdf.txt"); // checked exception : throws or try&catch
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public void method4(){
       method3(); // is made with try& catch block - permanent

    }



}
