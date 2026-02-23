//Write a recursive function to generate Fibonacci series up to N terms.
public class p7 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}