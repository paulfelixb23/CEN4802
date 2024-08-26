public class FibonacciCalculator {

    /**
     * Computes the nth term of the Fibonacci sequence using a recursive approach.
     *
     * The Fibonacci sequence is defined as:
     * - F(0) = 0
     * - F(1) = 1
     * - F(n) = F(n-1) + F(n-2) for n > 1
     *
     * @param n the position in the Fibonacci sequence to compute. It must be a non-negative integer.
     * @return the nth term of the Fibonacci sequence.
     */
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
