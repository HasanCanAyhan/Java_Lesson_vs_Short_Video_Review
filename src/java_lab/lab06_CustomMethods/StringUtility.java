package java_lab.lab06_CustomMethods;

public class StringUtility {



    // String sentence , String word
    public static int frequency(String sentence, String word){

        int count = 0;

       while(sentence.contains(word)) {

                sentence = sentence.replaceFirst(word,"");
                count++;

        }
        return count;
    }

    // String str , char ch
    public static int frequency(String str, char ch){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch){
                count++;
            }

        }

        return count;
    }

    // String word
    public static String reverse(String word){

        String result = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            char each = word.charAt(i);
            result += each;
        }
        return result;
    }


    public static String removeDup(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);

            // result.indexOf(each) < 0 or:
            if (!result.contains(""+each)){ // before adding the character to new string , we check if the character is not included in the new string
                result += each;
            }

        }

        return result;

    }


    }







