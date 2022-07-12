package java_short_video.OOPAbstraction.AbstractClass_vs_ConcreteClass;

public abstract class A {


    int a ;
    static int b;

    public A(){}

    public void method1(){}

    public static void method2(){}

    public  abstract  void method3();
}


final class B extends A{


    @Override
    public void method3() {

    }


}


class Abstract_ConcreteClass{

    public static void main(String[] args) {

        //A a = new A();

        B b = new B(); // concrete class
    }


}


