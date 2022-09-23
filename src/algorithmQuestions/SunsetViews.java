package algorithmQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        //                 0  1  2  3  4  5  6  7 : index
        sunsetViews(buildings, "east").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>();
        //{3, 5, 4, 4, 3, 1, 3, 2};
        // 0  1  2  3  4  5  6  7 : index


        int i = 0;
        int step = 1;

        if (direction.equalsIgnoreCase("west")) {

            i = buildings.length - 1;

            step = -1;
        }

        while (i >= 0 && i < buildings.length) { // it must be valid for east and west : those are borders

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){

                stack.pop();

            }

            stack.push(i);
            i += step;


        }

        if(direction.equalsIgnoreCase("west"))  Collections.reverse(stack);

        return new ArrayList<Integer>(stack);
    }


}

