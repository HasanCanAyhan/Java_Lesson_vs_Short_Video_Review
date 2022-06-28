package mentor_lesson.week8;

public class DuplicatedLettersCount {


    public static void main(String[] args) {


        String str = "aabbccde";
        System.out.println(duplicatedLettersCount(str));


    }


    public static int duplicatedLettersCount(String str){

        str =  str.toLowerCase();
        int dublicatedDigitCount = 0;

        for (char eachElement : str.toCharArray()) {

            if (str.substring(str.indexOf(eachElement) + 1).contains(eachElement+"")){
                dublicatedDigitCount++;
            }
            str = str.substring(str.indexOf(eachElement) + 1);
        }

        return dublicatedDigitCount;
    }

}
