package java_short_video.OOPAbstraction.abstractClass_Method;

public abstract class Shape {

    public abstract double area(); // created in an Abstract class or Interface


    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "area= " + area() +  "}";
    }



}
