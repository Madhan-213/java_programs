//Write a recursive function to find the sum of digits of a number.
public class p8 {

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }
}