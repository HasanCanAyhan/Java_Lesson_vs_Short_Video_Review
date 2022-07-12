package java_short_video.protectedAccessModifiers.package2;

import java_short_video.protectedAccessModifiers.package1.ProtectedAccessModifiers;

public class Test3 extends ProtectedAccessModifiers {

    public static void main(String[] args) {

        // different package and subClass : visible


        System.out.println(ProtectedAccessModifiers.protectedVar);
        ProtectedAccessModifiers.method2();



    }


}
