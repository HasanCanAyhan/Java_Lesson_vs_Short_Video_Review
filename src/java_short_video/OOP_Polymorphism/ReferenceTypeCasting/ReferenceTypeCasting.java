package java_short_video.OOP_Polymorphism.ReferenceTypeCasting;

import java_short_video.OOPAbstraction.Interface.*;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        //------------upcasting---------------------
        //   SUPER(Parent)   <------   SUB(Child)

        Shape shape1 =  (Shape )new Square(5); // upcasting :  Square(Child) --->>> Shape(Parent)
        // super type   <-----  sup type

        // Volume shape2 = new Square(5); error :  there is no IS A Relationship





        //------------down casting------------------
        //  SUB(Child)   <------    SUPER(Parent)

        Shape shape2  = new Cube();
        System.out.println( shape2.area()  );

        // 1.way to write
        Cube cube = (Cube) shape2;
        System.out.println( cube.volume()  );

        // or: 2.way to write
        System.out.println(   (   (Cube)shape2   ).volume()    ); // down casting


        //System.out.println(   (  (Cylinder)shape2      ).volume()           );
        //ERROR:  ClassCastException : there is no IS-A Relationship between Cylinder and shape2 whic references Cube object




    }

}
