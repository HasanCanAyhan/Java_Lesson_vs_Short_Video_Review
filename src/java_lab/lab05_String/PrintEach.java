package java_lab.lab05_String;

import java.util.Scanner;

public class PrintEach {


    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();



        for (int i = 0; i < word.length() ; i++) {

            char eachCh = word.charAt(i); // each character
            System.out.println(eachCh);


        }



    }




}
