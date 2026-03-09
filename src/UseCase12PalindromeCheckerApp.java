import java.util.*;

interface PalindromeStrategy {
    boolean check(String text);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i++) != text.charAt(j--)) return false;
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return strategy.check(clean);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();
        String input = "Race Car";

        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack: " + context.executeStrategy(input));

        context.setStrategy(new TwoPointerStrategy());
        System.out.println("Using Two-Pointer: " + context.executeStrategy(input));
    }
}
