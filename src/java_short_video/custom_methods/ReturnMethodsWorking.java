package java_short_video.custom_methods;

public class ReturnMethodsWorking {

    public static void main(String[] args) {


        int sonuc = dortcikar(ikitopla(ucilecarp(4)));

        System.out.println(sonuc + 1);


        fonksiyon(10);
        System.out.println(fonksiyon(10));

        g(5,3);
        System.out.println(g(5,3));


        System.out.println(g(5,3));









    }


    public static int ucilecarp(int a){

        return a *3; // 12

    }

    public static int ikitopla(int a){
        return a +2; // 14
    }

    public static int dortcikar (int a){
        return a - 4; // 10

    }



    public static int fonksiyon(int num){
        int sonuc = 5 * num +  10;
        return sonuc;
    }


    public static  int g(int x, int y){
        return fonksiyon(y + 2 * x);

    }


    }




