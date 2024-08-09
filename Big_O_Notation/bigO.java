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

    // Time complexity is O(n^2) - proportional to the square of number of inputs
    public static void nestedLoop(int[] numbers){
        for(int first : numbers){
            for(int second : numbers){
                System.out.print(first + " - " + second + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        int[] num = {1,2,3,4,6};
        printArr(num);
        printWithFor(num);
        System.out.println();
        printWithForEach(num);
        System.out.println();
        nestedLoop(num);
    }
}
