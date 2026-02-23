//Write a recursive function to calculate factorial of N.
public class p6 {

    public static long factorial(int n) {
  
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}