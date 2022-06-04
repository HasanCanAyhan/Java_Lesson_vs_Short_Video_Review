package java_short_video.custom_methods;

public class CustomMethodsParameter {

    public static void main(String[] args) {

        //int num = 5; or
        displayMessage(5);

        System.out.println("-------------");

        eligibleToVote(18,false);

        System.out.println("-------------");

        oddOrEven(10);


    }


    // Passing Argument to Method
    // public static void displayValue(int num){

    public static void displayMessage(int num){

        System.out.println("The value is: " + num);


    }


    public static void eligibleToVote(int age , boolean isUSCitizen){

        if(age >= 18   &&    isUSCitizen){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not eligible to Vote");
        }




    }


    public static void oddOrEven (int number){

        if(number %2 == 0){

            System.out.println(number+" is even number");

        }else{

            System.out.println(number+" is odd number");

        }


    }


}
