package java_short_video.custom_class1;

public class Circle {

    public double radius; // instance variable

    public static double pi = 3.14; // common for all the objects

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){ // intance method
        return radius * radius * pi;
    }

    public double calcPerimeter(){ // instance method
        return 2 * radius * pi;
    }

    public static void printPI(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


}
