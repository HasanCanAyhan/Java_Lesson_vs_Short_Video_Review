package algorithmQuestions;

import java.util.Arrays;

public class OddWithUnderscore {


    public static void main(String[] args) {

        String str = "abcde";

        String[] arr = str.split("");

        String result = "";


        if (arr.length % 2 != 0) {

            for (int i = 0; i < arr.length; i++) {


                if (i % 2 == 0 && i != 0) {

                    result += ",";
                }

                result += arr[i];



            }


            result += "_";


        } else {

            for (int i = 0; i < arr.length; i++) {

                if (i % 2 == 0 && i != 0) {

                    result += ",";
                }

                result += arr[i];

            }



        }


        if (str.length() % 2 == 0){
            String[] newArr1 = result.split(",");
            System.out.println("newArr = " + Arrays.toString(newArr1));
        }else{
            System.out.println("result = " + result); // abc_
            String[] newArr2 = result.split(",");
            System.out.println("newArr2 = " + Arrays.toString(newArr2));
        }


    }


}
/*
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
if the String is odd number, the last letter should have underscore
if is even, should be divided into pairs
in array
 */