package mentor_lesson.week7;

public class TaskVowel {

    public static void main(String[] args) {

        String str = "bbddeeaffg";
        //            0123456789



        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (current == 'a'  || current == 'e' || current == 'i' || current == 'u'){

                int count = 0;
                for (int j = 0; j < str.length() ; j++) {
                    if (current == str.charAt(j)){
                        count++;
                    }
                }

                if(count == 1){
                    System.out.println(i); // index number of from the given string
                    return; // exit/terminate the main method
                    // If it is written "break"--->> output will print  "System.out.println(i);" and " System.out.println("-1")";
                }



            }


        }

        System.out.println("-1");



    }

}
