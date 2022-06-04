package mentor_lesson.week7;

public class FirstNonRepeatingVowel {

    public static void main(String[] args) {

        String str = "google";

        System.out.println(getFirstNonRepeatingVowel(str)); // e


    }

    public static int getFirstNonRepeatingVowel(String str){

        for (int i = 0; i < str.length() ; i++) {
            char currentCh = str.charAt(i);

            if (currentCh == 'a' || currentCh == 'e' || currentCh == 'i' || currentCh == 'o' || currentCh == 'u' ){

                int foundVowelOccurrenceCount = 0;

                for (int j = 0; j < str.length() ; j++) {

                    if (currentCh == str.charAt(j)){
                        foundVowelOccurrenceCount++;
                    }
                }

                if(foundVowelOccurrenceCount == 1){
                    return i;
                }


            }
        }

        return -1;

    }

}
/*
Question 1: Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index. If it doesn't exist, return -1. Assume that all the characters of the String are lowercase.
(Do not use String class functions other than charAt())

Ex1: bbddeeaffgi
output: 6
 */
