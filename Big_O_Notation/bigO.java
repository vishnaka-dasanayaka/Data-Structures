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

    // Time complexity is O(log n) - shows a logarithmic change in time complexity
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents potential overflow

            if (array[mid] == target) {
                return mid; // Target found
            }
            if (array[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String [] args){
        int[] num = {1,2,3,4,6};
        printArr(num);
        printWithFor(num);
        System.out.println();
        printWithForEach(num);
        System.out.println();
        nestedLoop(num);
        System.out.println();
        System.out.println(binarySearch(num,6));
    }
}
