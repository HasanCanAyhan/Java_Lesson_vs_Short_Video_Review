package java_lab.lab05_String;

public class RemoveDuplicates {


    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char eachCh = str.charAt(i);

            if(!result.contains(""+eachCh)){
                result += eachCh;
            }


        }


        System.out.println("result = " + result);



    }




}
