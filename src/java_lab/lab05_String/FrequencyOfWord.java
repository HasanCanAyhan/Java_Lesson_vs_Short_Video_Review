package java_lab.lab05_String;

public class FrequencyOfWord {

    public static void main(String[] args) {


        // 1. Way : replace & length

        String sentence = "Java Java Java Java Python C# Ruby";
        int orginal_lenght = sentence.length();

        String temp = sentence;

        temp = temp.replace("Java","aaa");

        int new_lenght = temp.length();

        System.out.println("orginal_lenght = " + orginal_lenght); // ----->>>> 34
        System.out.println("new_lenght = " + new_lenght); // ----->>>> 30

        int totalNumberOfJava = orginal_lenght - new_lenght;

        System.out.println("totalNumberOfJava = " + totalNumberOfJava); // 4

        System.out.println("-----------------------------------------------------------");

        // 2. Way - that is shortcut of the first way

        String str = "Java Java Java Java Python C# Ruby";
        String temp1 = str.toLowerCase().replace("Java","abc");

        int total_number_of_java = str.length() - temp1.length();
        System.out.println("total_number_of_java = " + total_number_of_java);





    }

}
