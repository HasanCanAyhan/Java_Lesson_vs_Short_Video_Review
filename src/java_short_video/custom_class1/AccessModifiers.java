package java_short_video.custom_class1;

public class AccessModifiers {

    // public protected default private

    // A top level java class can have two access modifiers : public and default

    // Variables,Constructors and methods can have all four access modifiers

    /*

    Access Modifiers        Class       Package     Subclass        World

            public            y            y            y              y
            protected         y            y            y              n
      default(no modifier)    y            y            n              n
            private           y            n            n              n

     */

    private static int n1 = 100;

    static int n2 = 200; // default

    public static int n3 = 300;

    private static void method1(){
        System.out.println("method with private access modifier");
    }

    static void method2(){
        System.out.println("method with default access modifier");
    }

    public static void method3(){
        System.out.println("method with public access modifier");
    }


}
