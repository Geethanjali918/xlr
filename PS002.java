import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the next multiple of 100
        int nextMultiple = ((number / 100) + 1) * 100;

        // Display the result
        System.out.println("The next multiple of 100 after " + number + " is: " + nextMultiple);

        scanner.close();
    }
}
