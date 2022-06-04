package mentor_lesson.week6;

public class AnimalFeast_by_me {

    public static void main(String[] args) {


        System.out.println(isAllowedToBring("great blue heron ","garlic naan"));


    }


    public static boolean isAllowedToBring(String str1, String str2) {

       boolean isAllowed;

        //                    g-garlic naan     ==    g - great
        if ((str2.substring(0, 1).startsWith(str1.substring(0, 1)))
                && ("" + str2.charAt(str2.length() - 1)).equals("" + str1.charAt(str1.length() - 1))) {
        //                    n - garlic naan              ==           n - great blue heron

             isAllowed = true;

        } else {
             isAllowed = false;
        }


        // or you can write like this whis is better

        /*


       return  (str2.substring(0, 1).startsWith(str1.substring(0, 1)))
                && ("" + str2.charAt(str2.length() - 1)).equals("" + str1.charAt(str1.length() - 1));

         */

        return isAllowed;



    }

}
