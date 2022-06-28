package java_short_video.custom_class1;

public class StaticInitializerBlock {
    
    // It´s a set of instructions that is run only once when a class is loaded into memory
    // is also called static initialization block

    public static int a;
    public static String str;
    public static char ch;


    static {
        a = 100;
        str = "Java";
        ch = '@';
    }




    /*
    public static void main(String[] args) {

        a = 100;
        str = "java";
        ch = '@';

    }


     */

}
