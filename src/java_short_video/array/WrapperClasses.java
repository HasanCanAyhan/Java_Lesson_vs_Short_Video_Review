package java_short_video.array;

public class WrapperClasses {

    public static void main(String[] args) {


        // dedicated classes of 8 Primitives

        // presented in " java.lang "

        // provide the mechanism to convert primitive into object and object into primitive

        /*
        Primitive            Wrapper Classes

        byte                   Byte
        short                  short
        int                    Integer
        long                   Long
        float                  Float
        double                 Double
        char                   Character
        boolean                Boolean

         */

        // Primitive ---->>>> Wrapper Class(Object Type) : Auto Boxing
        // Wrapper Class(Object Type)----->> Primitive  : Unboxing


        byte a = 10;
        short b = 20;
        int c = 30;

        Byte x = a; // Primitive ---->> Wrapper Calss
        Short y = b;
        Integer z = c;

        byte q = x; // Wrapper class --->> primitive

        // parse metthods : converting strings to the primitives, returns primitive

        String str = "123";
        int num1 = Integer.parseInt(str);
        System.out.println("num1 = " + num1); // num1 = 123


        // valueOf methods : converting strings to the wrapper class object , returns wrapper class object

        String str2 = "1.5";

        Double e = Double.valueOf(str2);
        System.out.println("e = " + e); // 1.5

        // you can also do : double e = Double.valueOf(str2);  ( wrapper object --->> primitive : unboxing )



    }

}
