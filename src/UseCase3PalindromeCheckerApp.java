public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "radar";
        String reversed = "";


        for (int i = original.length() - 1; i >= 0; i--) {

            reversed = reversed + original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Success! '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is not a palindrome.");
        }
    }
}