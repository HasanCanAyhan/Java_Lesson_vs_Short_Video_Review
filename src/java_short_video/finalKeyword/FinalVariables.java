package java_short_video.finalKeyword;

public class FinalVariables {

    public final String language;
    public final static double PI;

    public FinalVariables(String language){
        this.language = language;
        //this.language = "Python";
    }

    static {
        PI = 3.14;
    }



    public static void main(String[] args) {


        final int number = 10;

        // number = 20; can not reassign because final keyword

        System.out.println(number);


    }

}
