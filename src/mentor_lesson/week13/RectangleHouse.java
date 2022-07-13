package mentor_lesson.week13;

public class RectangleHouse extends AbstractHouse implements House{

    private int width, length;

    public RectangleHouse(int width, int length,String name) {
        super(name);
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return super.getName();
    }


}
