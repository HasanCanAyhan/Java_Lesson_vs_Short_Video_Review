package java_short_video.OOPAbstraction.Interface;

public class Square extends Shape {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
