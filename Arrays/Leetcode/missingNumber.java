package Arrays.Leetcode;

import java.util.Arrays;

public class missingNumber {
    public static int missingNumber(int[] arr){
        int sum = (arr.length+1) * (arr.length+2)/2;

        for (int num : arr){
            sum -= num;
        }

        return sum;
    }

    public static void main(String[] a){
        int[] arr = {1,2,3,4,6,7,8};
        System.out.println(Arrays.toString(arr));

        System.out.println(missingNumber(arr));
    }
}
