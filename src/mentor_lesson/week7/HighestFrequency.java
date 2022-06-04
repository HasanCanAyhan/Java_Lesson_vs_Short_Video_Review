package mentor_lesson.week7;

public class HighestFrequency {

    public static void main(String[] args) {

        // with CustomMethod :


        String str = "aaabbccccddeeee";

        System.out.println(highestFrequency(str));


    }

    public static String highestFrequency(String str){

        String result = "";

        int max = 0;

        for (int i = 0; i < str.length() ; i++) {
            // count refreshes in each iteration so that developer aims to find all characters repetition..
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                // This if statement compares each character in this String
                if (str.charAt(i) == str.charAt(j)){
                    // If compiler finds any match incrementing the count...
                    count++;
                }

                // If we want to find the highest freq, then we can use an empty bucket to put our count in it...

                if(count > max){
                    max = count;
                    // At first result was empthy, we need to convert our char to String and assign it to result here...
                    result = ""+str.charAt(j);
                }

                // In next iterations result may not be empthy, this if block checks this condition...

                if ( count >= max   && !result.contains(""+str.charAt(i))){
                    // this line adds another same freq char to result
                    result += str.charAt(j);
                }


            }

        }

        return result;

    }


}
