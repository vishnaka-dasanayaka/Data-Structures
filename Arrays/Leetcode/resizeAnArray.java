package Arrays.Leetcode;

import java.util.Arrays;

public class resizeAnArray {
    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];

        for(int i = 0; i< arr.length;i++){
            temp[i] = arr[i];
        }

        return temp;
    }

    public static void main(String[] a){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        arr = resize(arr, arr.length*2);

        System.out.println(Arrays.toString(arr));

    }
}
