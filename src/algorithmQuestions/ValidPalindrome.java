package algorithmQuestions;

public class ValidPalindrome {

    public static void main(String[] args) {


        String str = "Do geese see God?";
        str = str.toLowerCase().replace(" ", "");


        String result= "";

        for (int i = 0; i < str.length() ; i++) {

            if (Character.isLetter(str.charAt(i))){
                result += str.charAt(i);
            }

        }



        System.out.println(isPalindrome(result));


    }

    private static boolean isPalindrome(String result) {

        int start = 0;
        int end = result.length()-1;

        while(start < end){

            if (result.charAt(start) != result.charAt(end)){
                return false;
            }

            start++;
            end--;

        }

        return true;
    }

}
