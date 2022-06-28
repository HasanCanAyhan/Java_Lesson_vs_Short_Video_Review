package java_short_video.custom_class1;

public class Test_ForStaticBlock_AccessModifiers {

    public static void main(String[] args) {

        //                   called through ClassName
        System.out.println( StaticInitializerBlock.a );
        System.out.println( StaticInitializerBlock.str);
        System.out.println( StaticInitializerBlock.ch );


        System.out.println("-----------------------------");

        // For Test we created two Test class  in the package custom_class1 and custom_class

        // Here is the same package with AccessModifiers Class


        //System.out.println( AccessModifiers.n1  ); // private is not visible
        System.out.println( AccessModifiers.n2 ); // default
        System.out.println( AccessModifiers.n3); // public


        //AccessModifiers.method1(); // private is not visible
        AccessModifiers.method2();//default
        AccessModifiers.method3();//public


    }


}
