package mentor_lesson.week13;

public class CircleHouse extends AbstractHouse implements House {

    int radius;

    public CircleHouse(int radius,String name) {
        super(name);
        this.radius = radius;
    }



    @Override
    public String toString() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


}
