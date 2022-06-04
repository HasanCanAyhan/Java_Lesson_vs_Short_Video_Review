package java_short_video.custom_methods;

public class ReturnMethodsWorking1 {

    public static void main(String[] args) {

        int n1 = 7;
        int n2 = 6;

        int b =toplama(n1,n2);
        System.out.println(b);

        int a = toplama(3,5);
        System.out.println(a);

        System.out.println("----------------------");

        System.out.println(merhaba("Can"));

        System.out.println("----------------------");

        System.out.println(yil(27));

        System.out.println("----------------------");

        bye();
        bye();
        bye();
    }

    public static int toplama(int sayi1, int sayi2){

        int cevap = sayi1 + sayi2;
        return cevap;

    }


    public static String merhaba(String ad){

        return "Merhaba " + ad;

    }



    public static String yil(int yas){
        int yil = 2022 - yas;

        String result = yil + " yilinda dogdunuz";

        return result;
    }

    public static void bye(){
        System.out.println("Bye");
    }


}
