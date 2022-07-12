package java_short_video.OOPAbstraction.Interface;

public class Circle extends Shape {

    public double radius;
    public static double pi = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
     return radius * radius * pi;
    }




}
