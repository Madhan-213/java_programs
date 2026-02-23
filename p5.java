//Write a function to check if a given number is prime.
public class p5{

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        int num1 = 29;
        int num2 = 15;

        System.out.println(num1 + " is prime? " + isPrime(num1));
        System.out.println(num2 + " is prime? " + isPrime(num2));
    }
}