package Arrays.Leetcode;

import java.util.Arrays;

public class sortBinaryArrayII {
    public static void sort(int[] arr){
        int i = 0;
        int j = 0;

        for(;i<arr.length;i++){
            if(arr[i] == 0 && arr[j] == 1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] == 0) {
                j++;
            }
        }
    }

    public static void main(String[] a){
        int[] arr = {1,1,0,0,1,1,0,0,1,0,1,0,0,1};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
