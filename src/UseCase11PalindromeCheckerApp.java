class PalindromeService {

    public boolean isPalindrome(String text) {
        if (text == null) return false;


        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String input = "Was it a car or a cat I saw?";

        if (service.isPalindrome(input)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is not a palindrome.");
        }
    }
}