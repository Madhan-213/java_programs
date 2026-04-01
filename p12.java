<<<<<<< HEAD

// java code to find prime Number

import java.util.Scanner;

public class p12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
=======
public class p12 {

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

   public static int sub(int c, int d) {
 	int subb=c-d;
	return subb;
	}

    public static void main(String[] args) {

        int result = add(4, 6);
	int res = sub(4,6);

        System.out.println("Sum = " + result +"\nsubb ="+res );
	
	
    }
}
>>>>>>> 40297c0 (add 2 programs files p12 and p13)
