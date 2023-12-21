package reverse;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int j : arr) {
            stack.push(j);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
}

