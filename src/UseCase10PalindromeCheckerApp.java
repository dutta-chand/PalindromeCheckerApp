public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized);

        System.out.println("Original: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    private static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}
