package java_short_video.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveIf {

    public static void main(String[] args) {


        // removeIf(Predicate): removes all the elemens from the ArrayList that are matching with the given predicate condition
        // you can use it in any of CollectionType

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8));

        // remove less than 5

        // Iterable : Interface

        list.removeIf(each -> each < 5);

        System.out.println(list);
        // [5, 5, 6, 6, 7, 7, 8, 8]

        System.out.println("-------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Python","C#","JavaScript","C++", "Ruby"));


        names.removeIf(  p -> p.startsWith("J") );

        System.out.println(names); // [Python, C#, C++, Ruby]


    }

}
