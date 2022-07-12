package java_short_video.OOPAbstraction.Interface;

public abstract class Shape {

    public abstract double area(); // created in an Abstract class or Interface

    //public abstract double volume();
    // if we create this method in the Abstract class,
    // that means, Rectangle, Circle, Square.... all of them has to have volume methods
    // this method is not common method for all the subclass



    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "area= " + area() +  "}";
    }



}
