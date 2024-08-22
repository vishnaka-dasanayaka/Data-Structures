package Arrays.Leetcode;

import java.util.Arrays;

public class shiftZeros {
    public static void moveZero(int[] arr){
        int i = 0;
        int j = 0;

        for(; i<arr.length;i++){
            if(arr[i] != 0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] != 0 ){
                j++;
            }
        }
    }

    public static void main(String[] a){
        int[] arr = {8,2,1,0,1,0,3};
         moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
