import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            char upperCaseChar = Character.toUpperCase(ch);
            System.out.println("The uppercase of " + ch + " is " + upperCaseChar);
        } else {
            System.out.println("Invalid input. Please enter a lowercase alphabetic character.");
        }
        scanner.close();
    }
}
