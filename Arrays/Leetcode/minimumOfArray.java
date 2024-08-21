package Arrays.Leetcode;

public class minimumOfArray {
    public static int minimum(int[] arr){
        int min = arr[0];

        for(int num : arr){
            if(num<min) min = num;
        }
        return min;
    }

    public static void main(String[] a){
        int[] arr = {110,10,5,24,2,5};
        System.out.println(minimum(arr));
    }
}
