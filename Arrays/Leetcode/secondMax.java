package Arrays.Leetcode;

public class secondMax {
    public static int secondMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max){
                secondMax = num;
            }

        }

        return secondMax;
    }

    public static void main(String[] a){
        int[] arr = {5,5,4,1,3};
        System.out.println(secondMaxValue(arr));
    }
}
