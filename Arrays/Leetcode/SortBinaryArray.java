package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Random;

public class SortBinaryArray {
    public static void sort(int[] arr){
        int[] ans = new int[arr.length];
        int count = 0;

        for (int j : arr) {
            if (j == 1) {
                ans[count] = 1;
                count++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void recSort(int[] arr, int count){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {

                arr[i] = arr[arr.length-1-count];
                arr[arr.length-1-count] = 0;
                if(i>=arr.length-count-1) break;
                count ++;
                //if (count == arr.length-1) break;
                recSort(arr,count);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1,0,0};

        int[] binaryArray = new int[100];
        Random random = new Random();

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2); // Fills with either 0 or 1
        }

        recSort(binaryArray,0);

        System.out.println(Arrays.toString(binaryArray));
    }
}
