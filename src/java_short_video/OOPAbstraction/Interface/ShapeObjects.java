package java_short_video.OOPAbstraction.Interface;

public class ShapeObjects {

    public static void main(String[] args) {


        //Shape shape = new Shape();  abstract class

        Circle circle = new Circle(2);

        Rectangle rectangle = new Rectangle(2,3);

        Square square = new Square(5);


        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }

}
