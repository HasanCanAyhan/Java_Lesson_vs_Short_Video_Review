package java_lab.lab05_String;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        // 3.Way by using substring

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;
        for (int i = 0; i <= sentence.length()-4  ; i++) {

            String eachCh = sentence.substring(i,i+4);

            if(eachCh.equalsIgnoreCase("Java")){
                countJava++;
            }

        }

        System.out.println(countJava);// 6

        System.out.println("----------------------------------------");

        // 1.Solution with replaceFirst

        String s = "Cat Cat Cat Dog Dog Dog  Dog  Dog  Dog  Dog ";

        int count_cat = 0;
        int count_dog = 0;

        while(s.contains("Cat")){
            s = s.replaceFirst("Cat","");
            count_cat++;
        }

        System.out.println("count_cat = " + count_cat); // 3


        while(s.contains("Dog")){
            s = s.replaceFirst("Dog","a");
            count_dog++;
        }

        System.out.println("count_dog = " + count_dog); // 7


        System.out.println("----------------------------------------");

        // 2.Solution with substring

        String str = "Cat Cat Cat Dog Dog Dog  Dog  Dog  Dog  Dog ";

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length()-3 ; i++) {

            String eachCh = str.substring(i,i+3);

            if(eachCh.equals("Cat")){
                countCat++;
            }

            if(eachCh.equals("Dog")){
                countDog++;
            }




        }
        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);

        System.out.println("----------------------------------------");


        // 3.Solution with replace & length

        String s1 = "Cat Cat Cat Dog Dog Dog  Dog  Dog  Dog  Dog ";

        String temp =  s1.replace("Cat","aa");

        int totalNumberOfCat = s1.length() - temp.length();
        System.out.println("totalNumberOfCat = " + totalNumberOfCat); // 3

        String temp1= s1;

        temp1 = temp1.replace("Dog","bb");

        int newLength = temp1.length();


        int totalNumberOfDog = s1.length() - newLength;
        System.out.println("totalNumberOfDog = " + totalNumberOfDog); // 7



    }

}
