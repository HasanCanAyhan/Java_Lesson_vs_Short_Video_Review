package java_lab.lab06_CustomMethods;

public class CustomMethodsPractice2 { // 12 - 16

    public static void main(String[] args) {


        System.out.println(doubleChar("AAbb")); //Question 12
        System.out.println("---------------------------");
        System.out.println(endsLy("oddy")); //Question 13
        System.out.println("---------------------------");
        System.out.println(hasBad("xbadxx")); //Question 14
        System.out.println("---------------------------");
        System.out.println(atFirst(""));  //Question 15
        System.out.println("---------------------------");
        System.out.println(isPalindrome("level")); //Question 16



    }

    public static String doubleChar(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char eachCh = str.charAt(i);
            result += ""+eachCh+eachCh;
        }

        return result;

    } // Question 12


    public static boolean endsLy(String str){

        return  str.endsWith("ly");

    }   // Question 13


    public static boolean hasBad(String str){

        if(str.length() >= 4 ){
            if (  str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")   ){
                return true;
            }

            return false;
        }

        if(str.equals("bad")){
            return true;
        }


        return false;

    } // Question 14


    public static String atFirst(String str){

        if(str.isEmpty()){
            return "@@";
        }else if(str.length() == 1){
            return str + "@";
        }else{
            return str.substring(0,2);
        }

    } // Question 15

    /*
    public static  boolean isPalindrome(String str){

        String result = "";

        for (int i = str.length() -1 ; i >= 0 ; i--) {

            result += ""+str.charAt(i);
        }


        if(str.equals(result)){
            return true;
        }

        return false;

    } // Question 16 -String utility

     */

    //-------------------------

    public static  boolean isPalindrome(String str){

        return  StringUtility.reverse(str).equalsIgnoreCase(str);

    } // Question 16 -String utility-Solution

}
/*
12.

Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

13.

Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

14.

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

15.

Given a string, return a string length 2 made of its first 2 chars. If the string
length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

16.

Write a method that accepts a string and returns true if the string is palindrome.


 */
