import java.util.Scanner;

class PalindromeOf3 {
    boolean isPalindromeOf3Digits(int n) {
        return (n / 100) == (n % 10);
    }
}

public class Demo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = scanner.nextInt();
        
        PalindromeOf3 obj = new PalindromeOf3();
        boolean isPalindrome = obj.isPalindromeOf3Digits(n);
        
        System.out.println("Is the number a palindrome? " + isPalindrome);
        
        scanner.close(); // Close the scanner to release resources
    }
}
