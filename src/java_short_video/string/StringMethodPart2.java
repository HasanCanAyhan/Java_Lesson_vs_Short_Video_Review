package java_short_video.string;

public class StringMethodPart2 {

    public static void main(String[] args) {

         /*
           In this Section :

               - replace() - replaceFirst() - substring() - repeat()

         */


        // *** replace(oldValue, newValue): replaces all the matching character(s) of the String
        // with the given new character(s), return type----->String

        String str1 = "Wooden Spoon";

        str1 = str1.replace("o","e"); // "Weeden Speen"

        System.out.println("str1 = " + str1);

        String sentence1 = "I love Java, Java is the best programming language";
        sentence1 = sentence1.replace("Java", "C# "); // I love C#, C# is the best programming language"

        System.out.println("sentence1 = " + sentence1);

        sentence1 = sentence1.replace("C#" , "Java");

        System.out.println("sentence1 = " + sentence1); // "I love Java, Java is the best programming language"

        System.out.println("----------------------------------------------------");


        // *** replaceFirst(oldValue, newValue): replaces  the first  matching character(s) of the String
        // with the given new character(s), return type----->String

        String str2 = "Wooden Spoon";

        str2 = str2.replaceFirst("o", "e"); // Weoden Spoon

        System.out.println("str2 = " + str2);

        String sentence2 = "I love Java, Java is the best programming language";

        sentence2 = sentence2.replaceFirst("Java" ,"C#"); // "I love C#, Java is the best programming language"

        System.out.println("sentence2 = " + sentence2);

        System.out.println("----------------------------------------------------");

        // 2 Type of substring()

        // ***1)  substring(begIndex): creates substring starting from the given beginning index to the end of the String, return type----->String

        String str3 = "Java Programming Language";

        String result1 = str3.substring( str3.indexOf("P") ); // Programming Language

        System.out.println("result1 = " + result1);

        //-----------------------------------------------------------------

        // ***2) substring(begIndex,endIndex ): creates substring starting from the given beginning index to the given ending index , return type----->String

        String result2 =  str3.substring(5, 16);
        // (5,15) : "Programmin" , not with "g" ---->> ending index is excluded! We should write here (5 for P , (15 +1 = 16) for space)
        System.out.println("result2 = " + result2);

        String result3 = str3.substring(  str3.indexOf("P") , str3.lastIndexOf(" ")  ); // Programming

        System.out.println("result3 = " + result3);

        // one more practice:

        String s1= "I love Java";
        // index:   012345

        String result4 = s1.substring( s1.indexOf("l") , s1.lastIndexOf(" ")   );
        // or :

        // String result4 = s1.substring(2,5+1);  // 2 ---> for l and (5+1)-----> for space

        System.out.println("result4 = " + result4);


        System.out.println("----------------------------------------------------");


        // *** repeat(N):repeats the string N number of times, return type----->String

        String str4 = "Java";

        String r = str4.repeat(3); //JavaJavaJava

        System.out.println("r = " + r);









    }



}
