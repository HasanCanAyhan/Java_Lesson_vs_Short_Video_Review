package java_short_video.string;

public class StringMethodPart1 {

    public static void main(String[] args) {

        // char can be Digit(1,2,3..) , Character(A,a;b;B), Special Character(*,!,#).

        /*

         Methods Of String :

         - charAt() - length() - toLowerCase() - to UpperCase() - trim() - indexOf()
         - lastIndexOf() - replace() - replaceFirst() - Substring() - repeat() -isEmpty()
         - isBlank() - equals() - equalsIgnoreCase() - contains() - startWith() -endsWith()

         */

        /*
           In this Section :

         - charAt() - length() - toLowerCase() - to UpperCase() - trim() - indexOf()
         - lastIndexOf()

         */


        // *** charAt(int index): returns the char at given index, return type----->char

        String str = "Cydeo";
        // index   :  01234

        // System.out.println(  str.charAt(4)   ); we can do like this or :
        char ch1 = str.charAt(4);
        System.out.println(ch1);

        System.out.println("----------------------------------------------------");

        // *** length(): returns the total number of characters, return type----->int

        String str2 = "Wooden Spoon"; // 12 characters totally
        //total number:123456789101112
        // index      :01234567891011

        int n1 = str2.length();
        System.out.println("n1 = " + n1); // 12

        int lastIndex = str2.length() -1 ;  // 11 : the last index number
        System.out.println("lastIndex = " + lastIndex);


        System.out.println("----------------------------------------------------");

        // *** toLowerCase(): returns the all lower case version of the String, return type----->String

        String str3 = "JavA";
        str3.toLowerCase(); // "java"
        //System.out.println("str3 = " + str3); // JavA : that means : not change because String is immutable , it can not be changed
        str3 = str3.toLowerCase(); // we have to assign again to str3
        System.out.println("str3 = " + str3); // java


        System.out.println("----------------------------------------------------");

        // *** toUpperCase(): returns the all Upper case version of the String, return type----->String

        String str4 = "Java";

        str4 = str4.toUpperCase(); // we have to assign again to str4
        System.out.println("str4 = " + str4); // JAVA



        System.out.println("----------------------------------------------------");

        // *** trim(): returns the String without all the white spaces (unused spaces), return type----->String

        String str5 = "       Java               Programming             Language                  ";
        str5 = str5.trim(); // we have to assign again to str5
        System.out.println("str5 = " + str5);//Java               Programming             Language

        System.out.println("----------------------------------------------------");

        // *** indexOf(str): returns the first matching character' index number, return type----->int

        String str6 = "Wooden Spoon";

        int indexNumOfFirstO = str6.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);// 1

        int indexNumOfSecondO = str6.indexOf("od");
        System.out.println("indexNumOfSecondO = " + indexNumOfSecondO);//2

        int indexNumOfThirdO = str6.indexOf("po") + 1;
        // here the reason  why we add + 1 is that the result normally returns the index number of "p" .
        // We want to find third "o" . Therefore, we add +1 in order to find the third "o".
        // or "oon" from the right view.
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO); // 9


        System.out.println("----------------------------------------------------");

        // *** lastIndexOf(str): returns the last  matching character' index number, return type----->int

        String str7 = "Wooden Spoon";

        int indexNumOfLastO = str7.lastIndexOf("o");
        System.out.println("indexNumOfLastO = " + indexNumOfLastO); // 10








    }

}
