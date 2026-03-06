import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UC13 {

    static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    static boolean twoPointerPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean pointerResult = twoPointerPalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("Stack Result: " + stackResult + " Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Result: " + dequeResult + " Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Result: " + pointerResult + " Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}
