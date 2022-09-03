package algorithmQuestions;
//https://youtu.be/gy1uve2BwG8
public class ReverseAStrıng_StringBuilder {

    public static void main(String[] args) {

        String str = "hello!!!";

        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println("reverse = " + reverse);

        System.out.println("------------------------------------------");

        System.out.println(reverseWithStringBuilder(str));

        System.out.println("------------------------------------------");

        System.out.println(reverseManually(str));

    }

    private static String reverseWithStringBuilder(String str) {

        return new StringBuilder(str).reverse().toString();

    }

    private static String reverseManually(String str){

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() -1 ; i >= 0; i--) {
            sb.append(str.charAt(i));
        }


        return sb.toString();

    }


}
