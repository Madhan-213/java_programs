//Write a function that takes a number and returns its square.
public class p2 {

    public static int getSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -3;

        System.out.println("Square of " + num1 + " is: " + getSquare(num1));
        System.out.println("Square of " + num2 + " is: " + getSquare(num2));
    }
}