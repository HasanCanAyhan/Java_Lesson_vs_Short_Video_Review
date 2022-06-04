package mentor_lesson.week6;

import java.util.Scanner;

public class AnimalFeast_method_by_me {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter an animal name:");
        String str1 = input.nextLine().toLowerCase();

        System.out.println("enter a dish name : ");
        String str2 = input.nextLine().toLowerCase();

        while (!(str1.length() >= 2 && str2.length() >= 2)) {
            System.err.println("Invalid ! Please re-enter:");
            System.out.println("enter an animal name:");
            System.out.println();
            str1 = input.nextLine().toLowerCase();
            System.out.println("enter a dish name : ");
            str2 = input.nextLine().toLowerCase();

        }

        for (; ; ) {


            if (!((str1.startsWith("_") || str1.endsWith(" ") && str1.endsWith("_") || str1.endsWith(" "))
                    && (str2.startsWith("_") || str2.endsWith(" ") && str2.endsWith("_") || str2.endsWith(" ")))) {

                System.out.println(isAllowedToBring(str1, str2));

                break;

            } else {
                System.err.println("Invalid ! Please re-enter:");
                System.out.println("enter an animal name:");
                System.out.println();
                str1 = input.nextLine().toLowerCase();
                System.out.println("enter a dish name : ");
                str2 = input.nextLine().toLowerCase();

            }


        }


    }


    public static boolean isAllowedToBring(String str1, String str2) {

        boolean isAllowed = true;

        for (int a = 0; ; ) {


            for (int i = 0; i < str1.length() && i < str2.length(); i++) {

                char eachCh_str1 = str1.charAt(i);
                char eachCh_str2 = str2.charAt(i);

                if (!((eachCh_str1 >= '0' && eachCh_str1 <= '9') && (eachCh_str2 >= '0' && eachCh_str2 <= '9'))) {

                    if ((str2.substring(0, 1).startsWith(str1.substring(0, 1)))
                            && ("" + str2.charAt(str2.length() - 1)).equals("" + str1.charAt(str1.length() - 1))) {

                        return true;

                    } else {
                        return false;
                    }

                } else {
                    System.err.println("Try again!");
                }


            }


            return isAllowed;

        }

    }

}










