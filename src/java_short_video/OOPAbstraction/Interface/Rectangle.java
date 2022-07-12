package java_short_video.OOPAbstraction.Interface;

public class Rectangle extends Shape {

    public  double width,length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }


}
