package reverse;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    private static String reverseString(String str) {
        Stack<String> stack = new Stack<>();
        String[] words = str.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop()).append(" ");
        }

        return reversedStr.toString().trim();
    }
}

