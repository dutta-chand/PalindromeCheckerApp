import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "rotator";
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to the Deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        // Compare front and rear until 0 or 1 character remains
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Result: " + (isPalindrome ? "Is a Palindrome" : "Not a Palindrome"));
    }
}