package mentor_lesson.week13;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeTest {

    public static void main(String[] args) {

        ArrayList<House> houses = new ArrayList<>(Arrays.asList(
                new SquareHouse(20, "Square-1"),
                new SquareHouse(25, "Square-2"),
                new SquareHouse(30, "Square-3"),

                new RectangleHouse(30, 20, "Rectangle-1"),
                new RectangleHouse(20, 25, "Rectangle-2"),

                new CircleHouse(15, "Circle-1"),
                new CircleHouse(20, "Circle-2"),
                new CircleHouse(10, "Circle-3")
        ));


        System.out.println(filterProperties(houses,600));
        // Square-2 Square-3 Circle-1 Circle-2


    }

    /* by ower
    public static ArrayList<String > filterProperties (ArrayList<House> houses, int minArea){

        ArrayList<String > result = new ArrayList<>();
        for (House house : houses){
            if (isAreaEnough(house, minArea)){
                result.add(house.getName());
            }
        }
        return result;
    }


     */



    // by me
    public static String filterProperties(ArrayList<House> houses , int minArea){

        String result = "";

        for (House house : houses) {

            if (isAreaEnough(house,minArea)){
                result += house.getName() + " ";
            }

        }


        return  result;


    }


    public static boolean isAreaEnough(House house , int minArea){

        if (house.getArea() >= minArea){
            return true;
        }

        return false;
    }

}
