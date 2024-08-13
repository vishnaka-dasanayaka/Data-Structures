package Arrays.Leetcode;

import java.util.Arrays;

public class ReversAnArray {
    public static int[] reverse(int[] arr){
        int[] ans = new int[arr.length];

        for (int i = 0, j = arr.length-1; i < arr.length ; i++, j--){
            ans[i] = arr[j];
        }
        return ans;
    }

    public static void reverseSameArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverse(arr)));

        int[] newArr = {7,4,1,5,9};
        System.out.println(Arrays.toString(newArr));
        reverseSameArray(newArr);
        System.out.println(Arrays.toString(newArr));


    }
}
