public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";   // string to check
        String reversed = "";    // store reversed string

        // Reverse the string using for loop
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if(word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}