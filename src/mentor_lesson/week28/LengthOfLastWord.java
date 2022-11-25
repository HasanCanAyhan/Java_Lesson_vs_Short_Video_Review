package mentor_lesson.week28;

public class LengthOfLastWord {

    public static void main(String[] args) {

        /*
        Given a string s consisting of words and spaces, return the length of the last word in the string.
        A word is a maximal substring consisting of non-space characters only.

        - split() and trim() method will not be used
         */

        String s = "  fly me  to  the moon  "; //
        //System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord2(s));

    }

    public static int lengthOfLastWord(String s){

        String result = "";
        int indexOfSpace = s.lastIndexOf(" ");

        if (indexOfSpace == s.length()-1){

            for (int i =s.length()-2; i >= 0 ; i--) {

                String space = "" + s.charAt(i);

                if (space.equals(" ")){
                    indexOfSpace = i;
                    break;
                }

            }

            result = s.substring(indexOfSpace+1, s.length()-1);
            System.out.println(result);
            return result.length();

        }


        result = s.substring(indexOfSpace+1);
        System.out.println(result);
        return result.length();


    }

    public static int lengthOfLastWord2(String s){

        int p = s.length()-1;

        while (s.charAt(p) == ' ' && p >= 0){

            p--;
        }


        int length = 0;
        while (p >= 0 && s.charAt(p) != ' '){
            p--;
            length++;
        }

        return length;

    }


}
