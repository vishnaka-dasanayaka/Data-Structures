package Big_O_Notation;

public class bigO {
    // Time complexity is  O(1) - not depending on the inputs
    public static void printArr(int[] numbers){
        System.out.print(numbers[0]);
    }

    public static void main(String [] args){
        int[] num = {111,2,3,4,6};
        printArr(num);
    }
}
