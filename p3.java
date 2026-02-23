//Write a function to calculate the sum of first N natural numbers.
public class p3 {

    public static int sumOfNaturalNumbers(int n) {
       
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println("Sum of first " + N + " natural numbers is: " + sumOfNaturalNumbers(N));
    }
}