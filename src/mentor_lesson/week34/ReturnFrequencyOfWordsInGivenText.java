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


        System.out.println(withStreamGetFreqOfWords(str));

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

    public static Map<String,Long> withStreamGetFreqOfWords(String str){

        if (str == null) return null;

        return Arrays.stream(str.trim().toLowerCase().split("\\W+"))
                //For using regex
                //https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285
                //https://regex101.com/
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }

}
