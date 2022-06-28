package java_short_video.array;

import java.util.Arrays; // need to be imported in our program

public class Arrays_Utility {

    public static void main(String[] args) {


        // Arrays Class : presented in " java.util" package
        /*
        methods:
            toString()
            sort()
            equals()
            copyOf()
            copyOfRange()

         */

        // toString() : converts array object to string , returns String

        String[] names = {"John","Smith","Can"};
        System.out.println(Arrays.toString(names)); // [John, Smith, Can]

        System.out.println("------------------------------------------------");

        //  sort() : sorts the array in ascending order -->> from smallest to largest

        int[] numbers = {5,1,3,4,2,0};

        System.out.println(Arrays.toString(numbers)); // [5, 1, 3, 4, 2, 0]

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // [0, 1, 2, 3, 4, 5]

        System.out.println("------------------------------------------------");

        // equals() : compares tow array object to if they have same elements in same order, returns boolean

        char[] arr1 = {'a','b','c'};
        char[] arr2 = {'a','b','c'};

        System.out.println(arr1 == arr2);// false - two different objects in the heap

        System.out.println(Arrays.equals(arr1,arr2)); // true

        System.out.println("------------------------------------------------");

        char[] arr3 = {'a','b','c'};
        char[] arr4 = {'b','a','c'};

        Arrays.sort(arr3); // {'a','b','c'};
        Arrays.sort(arr4); // {'a','b','c'};

        System.out.println(Arrays.equals(arr3,arr4)); // true

        System.out.println("------------------------------------------------");

        // copyOf(array, newLength) : copies the specified array elements and sets new length,returns new array

        int[] scores = {45,55,65,75,85};

        int[] scores2 = Arrays.copyOf(scores,8);

        System.out.println(Arrays.toString(scores2)); // [45, 55, 65, 75, 85, 0, 0, 0]

        int[] scores3 = Arrays.copyOf(scores, 3);

        System.out.println(Arrays.toString(scores3)); // [45, 55, 65]

        System.out.println("------------------------------------------------");

        // copyOfRange(array,begIndex, endIndex) : copies the specified range of the array , returns new array

        char[] elements = {'A',  'B' , 'C' , 'D' , 'E' , 'F'};
        // index:           0      1    2     3     4     5

        char[] someElements = Arrays.copyOfRange(elements,1,4+1); // like substring, endIndex is excluded

        System.out.println(Arrays.toString(someElements)); // [B, C, D, E]

    }

}
