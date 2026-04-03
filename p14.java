// Write a Java program to reverse a string.

public class p14 {
  
    public static void main(String[] args) {
        String str = "Java Programming";
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}
    

