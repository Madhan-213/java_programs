//Write a function to find the largest of three numbers.
public class p4 {

    public static int findLargest(int a, int b, int c) {
        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {
        int num1 = 25, num2 = 42, num3 = 17;

        int largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
    }
}