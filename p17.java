// Write a recursive function to check if a string is a palindrome.
public class p17 {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1, 0, word1.length() - 1));
        System.out.println(word2 + " is palindrome? " + isPalindrome(word2, 0, word2.length() - 1));
    }
}