package java_short_video.OOP_Polymorphism.PolymorphismIntro;

import java_short_video.OOPAbstraction.Interface.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Shape shape1 = new Circle(2);
        // shape1.radius = 10; you can not call, because it is no inside Reference Type(Shape)

        System.out.println(shape1.area());

        Shape shape2 = new Rectangle(2,3);
        //shape2.width = 2;
        //shape2.length = 3;


        System.out.println(shape2.area());

        Shape shape3 = new Square(4);

        System.out.println(shape3.area());

        System.out.println("---------------------------------");

        // following there is no Polymorphism


        Circle circle1 = new Circle(2);
        circle1.radius = 3;
        System.out.println(circle1.area());

        Rectangle rectangle1 = new Rectangle(2,3);
        rectangle1.width = 10;
        rectangle1.length = 20;
        System.out.println(rectangle1.area());


        Square square1 = new Square(5);
        square1.side = 50;
        System.out.println(square1.area());


        System.out.println("-------------------------");

        //Circle[] circles = { circle1, rectangle1,square1}; // error inside array it should be only circle objects

        Shape[] shapes = {circle1,rectangle1,square1,shape1,shape2,shape3 };

        //Volume obj = new Circle(); // error : there is no relationship between them

        Volume obj1 = new Cube();

        //System.out.println(obj1.area()); area method does not include inside Referance Type- Volume Interface
        System.out.println(obj1.volume());



        Volume obj2 = new Cylinder();
        obj2.volume();
        System.out.println(Volume.hasVolume);


    }

}
