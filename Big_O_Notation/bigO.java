package Big_O_Notation;

public class bigO {
    // Time complexity is  O(1) - not depending on the inputs
    public static void printArr(int[] numbers){
        System.out.println(numbers[0]);
    }

    // Time complexity is O(n) where n is number of inputs - directly proportional to the number of inputs
    public static void printWithFor(int[] numbers){
        for(int i =0  ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    // Time complexity is O(n)
    public static void printWithForEach(int[] numbers){
        for(int number : numbers) System.out.print(number + " ");
    }



    public static void main(String [] args){
        int[] num = {111,2,3,4,6};
        printArr(num);
        printWithFor(num);
        System.out.println();
        printWithForEach(num);
    }
}
