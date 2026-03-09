public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "racecar";

        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {

            if (charArray[i] != charArray[j]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}