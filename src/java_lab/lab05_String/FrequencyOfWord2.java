package java_lab.lab05_String;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        // 2.Way

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;

        while (sentence.contains("Java")) { // while the sentence has java

            sentence = sentence.replaceFirst("Java",""); // remove one "Java" at a time
            countJava++; // increase the number of java by 1

        }

        System.out.println(countJava);

        System.out.println("------------------------------------------------------");

        // By using another-condition

        String sentence1 = "Java Java Java Java Python C# Ruby Java Java";

        int count = 0;

        while(sentence1.indexOf("Java") > -1  ){

            sentence1 = sentence1.replaceFirst("Java", "");

            count++;
        }


        System.out.println(count); // 6



    }

}
