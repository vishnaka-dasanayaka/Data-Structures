package Arrays.Leetcode;

import java.util.Arrays;

public class RemoveEvenNumbers {

    public static int[] removeEvenNumbers(int[] arr){
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 1) {
                count++;
            }
        }

        int[] ans = new int[count];
        int index = 0;

        for(int item : arr){
            if(item % 2 == 1){
                ans[index] = item;
                index++;
            }
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,13};

        removeEvenNumbers(arr);
    }

}
