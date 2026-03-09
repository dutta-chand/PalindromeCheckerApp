class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        if (input.isEmpty()) return;

        Node head = new Node(input.charAt(0));
        Node temp = head;
        for (int i = 1; i < input.length(); i++) {
            temp.next = new Node(input.charAt(i));
            temp = temp.next;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null, current = slow, nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        Node firstHalf = head, secondHalf = prev;
        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
