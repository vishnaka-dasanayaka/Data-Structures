package Arrays.Leetcode;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] a){
        int[] arr = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
