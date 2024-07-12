package stackexample;

import java.util.Stack;

public class IterativeFactorial {

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Faktorial " + number + " = " + result);
    }

    public static int factorial(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n);
            n--;
        }

        int result = 1;
        while (!stack.isEmpty()) {
            result *= stack.pop();
        }

        return result;
    }
}
