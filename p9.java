//Write a recursive function to calculate the power (a^b).
public class p9 {

    public static long power(int a, int b) {
        if (b == 0) {
            return 1; 
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}