public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        // Call recursive method
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}