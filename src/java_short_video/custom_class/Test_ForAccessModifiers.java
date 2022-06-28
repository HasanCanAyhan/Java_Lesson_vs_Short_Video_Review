package java_short_video.custom_class;

import java_short_video.custom_class1.AccessModifiers;

public class Test_ForAccessModifiers {

    public static void main(String[] args) {

        // Here is the different package with AccessModifiers Class

        //System.out.println(AccessModifiers.n1);// private is not visible
        //System.out.println(AccessModifiers.n2);// default is not visible
        System.out.println(AccessModifiers.n3); // public always visible


        //AccessModifiers.method1();// private is not visible
        //AccessModifiers.method2();// default is not visible
        AccessModifiers.method3();// public always visible



    }

}
