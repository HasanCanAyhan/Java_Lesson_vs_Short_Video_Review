package java_short_video.protectedAccessModifiers.package1;

public class Test1 {

    public static void main(String[] args) {


        // same package : always visible

        System.out.println(ProtectedAccessModifiers.protectedVar);
        ProtectedAccessModifiers.method2();



    }

}
