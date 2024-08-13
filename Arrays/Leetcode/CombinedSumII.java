package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinedSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<Integer> candidate = new ArrayList<>();

        for (int item : candidates) {
            if(item<target) candidate.add(item);
        }

        Collections.sort(candidate);



        List<List<Integer>> list = new ArrayList<>();



        return list;
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum2(candidates,target));


    }
}
