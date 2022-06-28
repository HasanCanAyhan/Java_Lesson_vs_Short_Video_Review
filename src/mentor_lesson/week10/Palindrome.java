package mentor_lesson.week10;

import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("carac"));
        System.out.println(getPalindromes(new String[]{"abc", "car", "ada", "racecar","cool"}));


    }


    public static ArrayList<String> getPalindromes(String[] array){

        ArrayList<String> result = new ArrayList<>();

        for (String each : array) {
            //call the method you have created for question-1

            if (isPalindrome(each)){
                result.add(each);
            }

        }

        return result;

    }


    public static boolean isPalindrome(String str){

        if(str.isBlank()){
            return true;
        }

        str = str.toLowerCase().replace(" ", "");
        int srtLength = str.length();

        for (int i = 0 , j = srtLength -1 ; i < str.length()/2 ; i++, j--) {

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }

            //     c a r a c
            //       |   |

        }

        return true;


    }




}
/*
Write a method that takes in a non
empty array of Strings
that will return an ArrayList which consist of palindromic
strings in given array.
The input string can be assumed to contain only alphabets
(both uppercase and lowercase) and numeric
 */