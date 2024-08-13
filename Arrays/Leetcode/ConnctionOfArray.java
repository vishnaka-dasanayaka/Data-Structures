package Arrays.Leetcode;

import java.util.Arrays;

public class ConnctionOfArray {

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2*nums.length];

        for(int i =0  ; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String [] a){
        int[] arr = {1,3,2,1};

        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
