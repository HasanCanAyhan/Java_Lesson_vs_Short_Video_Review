package java_short_video.custom_class1;

public class CircleObjects {

    public static void main(String[] args) {


        Circle circle1 = new Circle(3);

        Circle circle2 = new Circle(4);

        Circle circle3 = new Circle(5);

        System.out.println(circle1.pi);//3.14
        System.out.println(circle2.pi);//3.14   -->>> one copy because static variable
        System.out.println(circle3.pi);//3.14


        Circle.printPI();

    }


}
