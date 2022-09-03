package algorithmQuestions;

public class ReverseAStrıng_StringBuilder {

    public static void main(String[] args) {

        String str = "hello!!!";

        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println("reverse = " + reverse);
    }

}
