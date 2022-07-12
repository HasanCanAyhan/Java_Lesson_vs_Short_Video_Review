package java_short_video.OOPAbstraction.Interface.abstarctClass_vs_Interface;



interface A{ // you can not give final keyword

    int a = 100; // static and final , public access modifier - it is given by default

    // public void method1(){} - error : because it is instance method

    public static  void method2(){

    }


    void method3(); // it is abstract method - you do not need to write "abstract keyword"

    public default void method4(){ // default method can have block{}

    }


}


 abstract class X{ // you can not give final keyword
// we can write any acces modifiers
    int a;
    static  int b;

    public X(){ // constructor

    }

    public void method(){ // instance method

    }

    public static void method2(){ // static method

    }

    public abstract void method3(); // it has to be there "abstract keyword"


    }


public class AbstractClass_vs_Interface {

    public static void main(String[] args) {

        //A obj = new A(); -- interface
        //X obj2 = new X(); -- abstract    both of them can not be instantiated!!


    }


}
