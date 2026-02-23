//Write a function in Java to check if a number is even or odd.

public class p1 {
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }


    public static void main(String[] args) {
        checkEvenOdd(10);  
        checkEvenOdd(7);   
    }
}