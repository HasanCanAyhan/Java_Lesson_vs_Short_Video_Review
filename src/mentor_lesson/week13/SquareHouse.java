package mentor_lesson.week13;

public class SquareHouse extends AbstractHouse implements House {

    private int side;

    public SquareHouse(int side,String name) {
        super(name);
        this.side = side;
    }


    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
