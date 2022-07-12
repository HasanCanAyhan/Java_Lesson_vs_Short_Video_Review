package java_short_video.OOPAbstraction.abstractClass_Method;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
