package java_short_video1.functionalInterface_lambdaExpressions;

public class Test {

    public static void main(String[] args) {


        MyInterface<Integer> cube = (x) -> {
            System.out.println(x * x * x);
        } ;

        cube.function(10);//1000


        MyInterface<Integer> oddOrEven = a -> {
            if (a %2 == 0){
                System.out.println(a + " is even");
            }else{
                System.out.println(a + " is odd");
            }
        };

        oddOrEven.function(5);


        System.out.println("---------------");

        MyInterface<String> reverse = (str) -> {

            for (int i = str.length() -1; i >= 0 ; i--) {
                System.out.print(str.charAt(i));
            }

            System.out.println();
        };


        reverse.function("Wooden Spoon");


    }



}
