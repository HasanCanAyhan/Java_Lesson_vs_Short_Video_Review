package java_short_video.OOPInheritance_SuperKeyword.Method_Overriding;

public class Circle extends Shape{


    public double radius;
    public static double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override // optional to write that
    public double area(){
        return radius * radius * pi;
    }

    public double perimeter(){
        return  2 * radius * pi;
    }




}
