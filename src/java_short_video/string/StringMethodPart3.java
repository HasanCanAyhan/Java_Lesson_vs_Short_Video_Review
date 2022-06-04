package java_short_video.string;

public class StringMethodPart3 {

    public static void main(String[] args) {

        /*
           In this Section :

        -isEmpty()  - isBlank() - equals() - equalsIgnoreCase() - contains() - startWith() -endsWith()

        All of them returns boolean

         */


        // ***  isEmpty(): check if the string'length is zero ,return type----->boolean

        String str = "   ";

        boolean r1 = str.isEmpty();

        System.out.println("r1 = " + r1); // false


        System.out.println("----------------------------------------------------");

        // ***  isBlank(): check if the string is blank ,return type----->boolean

        String str2 = "   ";

        boolean r2 = str2.isBlank(); // blank means  not any words, special characters

        System.out.println("r2 = " + r2);// true
        //   boolean r2 = str2.isEmpty() returns False

        System.out.println("----------------------------------------------------");

        // ***  equals(String) : compares the content of the two Strings ,return type----->boolean

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true   // note Java Language is "Case" sensitive

        System.out.println("----------------------------------------------------");

        // ***  equalsIgnoreCase(String) : compares the content of the two Strings irrespective of the case sensitivity,return type----->boolean

        String word1 = "JAVA";
        String word2 = "java";

        System.out.println(word1.equals(word2)); // false

        System.out.println(word1.equalsIgnoreCase(word2)); // true


        System.out.println("----------------------------------------------------");

        // ***  contains(String) : checks if the given string is contained in the String,return type----->boolean

        String sentence = "I love Java programming Language";

        boolean hasCSharp = sentence.contains("C#");

        System.out.println("hasCSharp = " + hasCSharp);// false  that means: There is no "C#" in the String

        boolean hasJava = sentence.contains("Java");

        System.out.println("hasJava = " + hasJava);// true


        System.out.println("----------------------------------------------------");

        // ***  startsWith(String) : checks if the  string started with the given character(s) ,return type----->boolean

        String name = "Wooden Spoon";
        boolean result1 = name.startsWith("Wood");  // true
        System.out.println("result1 = " + result1);
        boolean result2 = name.startsWith("Spoon"); // false
        System.out.println("result2 = " + result2);

        System.out.println("----------------------------------------------------");

        // ***  endsWith(String) : checks if the  string ends  with the given character(s) ,return type----->boolean

        boolean result3 = name.endsWith("Spoon");  // true
        System.out.println("result3 = " + result3);





    }

}
