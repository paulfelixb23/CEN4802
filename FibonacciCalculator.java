public class FibonacciCalculator {

    // Recursive method to return the nth term of the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method
    public static void main(String[] args) {
        int n = 10; // Example input
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is: " + result);
    }
}
