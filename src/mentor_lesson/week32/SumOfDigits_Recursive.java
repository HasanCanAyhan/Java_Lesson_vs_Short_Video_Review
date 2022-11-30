package mentor_lesson.week32;

public class SumOfDigits_Recursive {

    public static void main(String[] args) {

        int num = 3215;
        int sum = 0;
        int total = sumOfDigits_Recursive(num, sum);
        System.out.println(total);
    }


    public static int sumOfDigits_Recursive(int num, int sum){

        if (num == 0){
            return sum;
        }

        if (num < 10){
            return num;
        }

        sum += sumOfDigits_Recursive((num / 10), sum);
        sum += sumOfDigits_Recursive((num % 10), sum);

        int a = 0;
        int b = 0;
        if (sum > 10){
            a = sum /10;
            b = sum %10;
            sum = a + b;
        }

        return sum;
    }

}
