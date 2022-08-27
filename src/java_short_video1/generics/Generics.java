package java_short_video1.generics;

import java.util.List;

public class Generics <T>{ // for non-static

    // parameterized types
    // allows us reuse the same code with different types
    // can be applied to method, class and interface

    //           anyTypes
    public  void printEach(T[] array){

        // it accepts array of any object type

        for (T each : array) {
            System.out.println(each);
        }

    }

    public void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }


}
