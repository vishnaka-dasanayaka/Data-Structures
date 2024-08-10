package Arrays.Leetcode;

import java.util.Arrays;

public class MaximumWater {
    public static int maxArea(int[] heights){

        int area = 0;

        for(int i = 0; i < heights.length; i++){
            for (int j = 0; j < heights.length; j++){
                if(heights[i]>=heights[j]){
                    area = heights[j]*(j-i)>area ? heights[j]*(j-i) : area;
                }else if(heights[i]<heights[j]){
                    area = heights[i]*(j-i)>area ? heights[i]*(j-i) : area;
                }
            }
        }
        return area;
    }

    public static void main(String [] a){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
}
