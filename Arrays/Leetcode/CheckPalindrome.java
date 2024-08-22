package Arrays.Leetcode;

public class CheckPalindrome {
    public static boolean check(String word){

        char[] letters = word.toCharArray();

        int start = 0;
        int end = letters.length-1;

        while (start<end){
            if(letters[start] != letters[end]) return false;
            start++;
            end--;
        }

        return true;

    }

    public static void main(String[] a){
        String word = "madam";

        System.out.println(check(word));
    }
}
