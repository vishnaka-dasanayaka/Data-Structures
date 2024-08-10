package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] arg){
        // when items are unknown
        int[] numbers = new int[3];
        System.out.println(numbers); // returns [I@4a574795

        // using Arrays class by util
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers));

        // when items are known
        String[] names = {"Sachin", "Vishnaka", "Dasanayaka"};
        System.out.println(names);

        System.out.println(Arrays.toString(names));

        // Array methods
        System.out.println("Length of the array : " + numbers.length);
    }
}
