import java.util.*;

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "a".repeat(10000); // Large string for measurement

        long start, end;

        start = System.nanoTime();
        checkStringReverse(input);
        end = System.nanoTime();
        System.out.println("String Reverse: " + (end - start) + " ns");

        start = System.nanoTime();
        checkTwoPointer(input);
        end = System.nanoTime();
        System.out.println("Two-Pointer:    " + (end - start) + " ns");

        start = System.nanoTime();
        checkStack(input);
        end = System.nanoTime();
        System.out.println("Stack-based:    " + (end - start) + " ns");
    }

    private static boolean checkStringReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        return str.equals(rev);
    }

    private static boolean checkTwoPointer(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) if (str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }

    private static boolean checkStack(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) s.push(c);
        for (char c : str.toCharArray()) if (c != s.pop()) return false;
        return true;
    }
}
