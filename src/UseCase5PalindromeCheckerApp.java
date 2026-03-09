import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (input.equals(reversed)) {
            System.out.println("The word '" + input + "' is a palindrome.");
        } else {
            System.out.println("The word '" + input + "' is not a palindrome.");
        }
    }
}