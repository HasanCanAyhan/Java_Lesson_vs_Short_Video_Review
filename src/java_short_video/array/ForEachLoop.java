package java_short_video.array;

public class ForEachLoop {

    public static void main(String[] args) {

        /*
        Syntax:

        for(dataType variableName : dataStructure){
            // Statement
        }
         */


        int[] numbers = {10, 20,30,40,50,60,70,80};


        //    dataType     Array as data structure
        for(   int each : numbers    ){
            System.out.println(each); // from first element to last element
        }


        System.out.println("-------------------------------------");

        String[] fruits = {"Orange","Banana","Apple","Strawbery","Lemon","Grape"};


        for (String fruit : fruits) {
            System.out.println(fruit);  // fruit represents each of the element in the String Array
        }




    }
}
