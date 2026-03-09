public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";
        String reversed = "";


        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }


        if (original.equals(reversed)) {

            System.out.println("The word '" + original + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a Palindrome.");
        }
    }
}