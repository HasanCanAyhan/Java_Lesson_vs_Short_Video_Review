package java_short_video.OOPInheritance_SuperKeyword.Method_Overriding;

public class Square extends Shape{

    public double side;

    public Square (double side){
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }


}
