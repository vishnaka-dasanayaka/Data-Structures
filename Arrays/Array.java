package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] arg){
        // when items are unknown - run time declaration
        int[] numbers = new int[3];
        System.out.println(numbers); // returns [I@4a574795

        // using Arrays class by util
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers));

        // when items are known - compile time declaration
        String[] names = {"Sachin", "Vishnaka", "Dasanayaka"};
        System.out.println(names);

        System.out.println(Arrays.toString(names));

        // Array methods
        System.out.println("Length of the array : " + numbers.length);

        // run-time insertion and traversal
//        int[] customArray = new int[50];
//        int size;
//
//        System.out.println("Enter the size of the array : ");
//
//        Scanner s = new Scanner(System.in);
//        size = s.nextInt();
//
//        // Time complexity = O(n)
//        System.out.println("Enter 5 integers : ");
//        for (int i = 0; i < size ; i++){
//            customArray[i] = s.nextInt();
//        }
//
//        // Time complexity = O(n)
//        for (int i = 0; i < size; i++) {
//            System.out.print(customArray[i] + " ");
//        }

        // Insert an item at specific point

        int[] array = new int[10];
        array[0] = 6;
        array[1] = 4;
        array[2] = 0;
        array[3] = 2;
        array[4] = 8;

        System.out.println(Arrays.toString(array));

        // add 7 at index 2

        // Insertion O(n)
        for(int i = array.length-1; i > 0 ; i--){
            array[i] = array[i-1];
        }
        array[0] = 7;

        System.out.println(Arrays.toString(array));

        // Delete array[3] from the array
        for(int i = 3; i<array.length-1; i++ ){
            array[i] = array[i+1];
        }
        array[9] =0;

        System.out.println(Arrays.toString(array));

        System.out.println();
    }
}
