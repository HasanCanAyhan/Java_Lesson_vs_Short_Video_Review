package java_short_video.OOPAbstraction.Interface;

public class Cube extends Shape implements Volume{


    @Override // from Abstract class Shape
    public double area() {
        return 0;
    }


    @Override // from interface class  Volume
    public double volume() {
        return 0;
    }



}
