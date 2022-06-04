package java_lab.lab05_String;

public class Reverse {

    public static void main(String[] args) {

        String word = "Wooden Spoon";

        String reverse_result = "";

        for (int i = word.length() -1; i >= 0 ; i--) {

            char eachCh = word.charAt(i);

            reverse_result += eachCh;

        }


        System.out.println("reverse_result = " + reverse_result);

    }

}
