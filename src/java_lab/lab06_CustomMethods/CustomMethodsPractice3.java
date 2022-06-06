package java_lab.lab06_CustomMethods;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        String str = "aaaabccdeeeef"; // bdf- unique characters

        String unique = "";

        for (int i = 0; i < str.length() ; i++) {

            int frequency = StringUtility.frequency(str,str.charAt(i));

            if(frequency == 1){
                unique += str.charAt(i);
            }

            /*
            if(StringUtility.frequency(str,str.charAt(i) == 1 ){
                unique += str.charAt(i);
            }
             */

        }

        System.out.println("unique = " + unique); // bdf



        System.out.println("--------------------------------");



        String s = "aaabbc";// a3b2c1 //  each characters  and it's frequency

        String nonDuplicated = StringUtility.removeDup(s); // a b c

        String result = "";

        for (int i = 0; i < nonDuplicated.length() ; i++) {

            char ch = nonDuplicated.charAt(i);

            int f = StringUtility.frequency(s,ch);

            result += ""+ch;
            result += f;

            /*
            or:

            result += nonDuplicated.charAt(i) + StringUtility.frequency(s,nonDuplicated.charAt(i));
             */

        }

        System.out.println("result = " + result); // a3b2c1


    }

}
