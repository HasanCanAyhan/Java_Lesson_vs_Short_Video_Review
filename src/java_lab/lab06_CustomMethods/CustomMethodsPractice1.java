package java_lab.lab06_CustomMethods;

public class CustomMethodsPractice1 { // 6 - 11

    public static void main(String[] args) {


        System.out.println(comboString("Ab", "Hi")); // Question 6
        System.out.println("---------------------------------------");
        System.out.println(left2("java")); // Question 7
        System.out.println("---------------------------------------");
        System.out.println(right2("Hello")); // Question 8
        System.out.println("---------------------------------------");
        System.out.println(frontAgain("edit"));// Question 9
        System.out.println("---------------------------------------");
        System.out.println(countHi(" hihihihi")); // Question 10
        System.out.println("---------------------------------------");
        System.out.println(catDog("catcatdogdog")); // Question 11





    }

    public static String comboString(String str1, String str2){

        if (str1.length() > str2.length() ){
            return str2+str1+str2;
        }else if ( str2.length() > str1.length()  ){
            return str1+str2+str1;
        }

        return str1+str2;

    } // Question 6

    public static String left2(String str){

        if(str.length() < 2){
            return str;
        }

        String substring1 = str.substring(0,2);
        String substring2 = str.substring(2);

        return substring2 + substring1;

    } // Question 7

    public static String right2(String str){

        if(str.length() < 2){
            return "Invalid";
        } else if (str.length() == 2) {
            return str;
        }


        String sub1 = str.substring(str.length() -2);
        String sub2 = str.substring(0,str.length()-2);

        return sub1+sub2;




    }// Question 8

    public static boolean frontAgain(String str){

        /*
        if(str.length() < 2){
            return false;
        }

        if( str.startsWith(str.substring(0,2)) && str.endsWith(str.substring(0,2))  ){
            return true;
        }

        return false;


         */

        String first2Ch = str.substring(0,2);
        String last2Ch = str.substring(str.length()-2);

        return  first2Ch.equals(last2Ch);




    } // Question 9

    /*
    public static int countHi(String str){

        int count = 0;
        while( str.contains("hi")   ){

            str = str.replaceFirst("hi", "");
            count++;
        }

        return count;

    } // Question 10

     */ // Q10

    public static int countHi(String str){

        return StringUtility.frequency(str,"hi");

    } // Question 10- StringUtility-Solution



    //-----------------------------------------------

    /*
    public static boolean catDog(String str){

        int countCat = 0;
        int countDog = 0;

        while(str.contains("cat")){
            str = str.replaceFirst("cat","");
            countCat++;
        }

        while(str.contains("dog")){
            str = str.replaceFirst("dog","");
            countDog++;
        }


        return countCat == countDog;
    } // Question 11



 */ // Q11

    public static boolean catDog(String str) {

        str = str.toLowerCase();

        int count_cat = StringUtility.frequency(str,"cat");
        int count_dog = StringUtility.frequency(str,"dog");

        return count_cat == count_dog;

    } // Question 11- StringUtility-Solution


}
/*
6.
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter
string on the outside and the longer string on the inside.

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"

7.
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the
end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"

8.
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the
start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"

9.
Given a string, return true if the first 2 chars in the string also appear at the end of the
string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

10.

Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2

11.
Return true if the string "cat" and "dog" appear the same number of times in the given
string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true


 */
