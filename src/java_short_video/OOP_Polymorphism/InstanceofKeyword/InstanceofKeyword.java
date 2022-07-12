package java_short_video.OOP_Polymorphism.InstanceofKeyword;

import java_short_video.OOPAbstraction.Interface.*;

public class InstanceofKeyword {

    public static void main(String[] args) {

        //-Instanceof keyword can be used to check if the object is certain class. (Returns boolean)

        Shape shape1 = new Circle(2);

        Shape shape2 = new Square(2);

        Shape shape3 = new Rectangle(2,3);

        Shape shape4 = new Cube();

        Shape shape5 = new Cylinder();

        //    object             Class             shape 1 : reference name and referencing the object
        if ( shape1  instanceof Square  ){
            System.out.println("It is a square");
        }else{
            System.out.println("It is not a square");
        }

        System.out.println("--------------------------------");


        if (shape3 instanceof Rectangle){ // we are checking shape3 object is from Rectangle class or not
            System.out.println("It is(this object) a rectangle");
        }else{
            System.out.println("It is(this object)not a rectangle");
        }

    }


}
