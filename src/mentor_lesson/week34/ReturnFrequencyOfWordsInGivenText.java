package mentor_lesson.week34;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReturnFrequencyOfWordsInGivenText {

    public static void main(String[] args) {

        //String str = "     This is an example of example ???";
        String str = "This is an example of example";

        //String str = "“This”    is    an example! of Example…";

        findFrequencyOfWords(str);

    }

    public static void findFrequencyOfWords(String str){

        String trim = str.trim().toLowerCase();

        String result = "";
        for (int i = 0; i < trim.length() ; i++) {
            char ch = trim.charAt(i);

            if (ch == ' ' ){
                result += ch;
            } else if (Character.isLetter(ch)) {
                result += ch;
            }

        }


        String[] s = result.split(" ");
        System.out.println("s : "+Arrays.toString(s));


        System.out.println("---------------------");

        Map<String, Long> collect = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        collect.entrySet().removeIf(stringLongEntry -> stringLongEntry.getKey().isEmpty());

        System.out.println(collect);


    }


}
