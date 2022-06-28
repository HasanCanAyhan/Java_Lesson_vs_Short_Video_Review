package java_short_video.array;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {


        // allows us to store objects
        // size is automatically adjusted( *** has add and remove functions)
        // does not support primitives

        // * import java.util.ArrayList

        // ArrayList<DataType> name = new ArrayList<>();

        // it must be Wrapper Class - non primitive type, ex: Integer...
        ArrayList < Integer >  list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);

        System.out.println(list);
        System.out.println(list.size()); // size is like length





    }


}
