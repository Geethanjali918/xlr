import java.util.Scanner;
public class Demo19a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int nextMultipleOfFive = (number / 5 + 1) * 5;
        System.out.println("The next multiple of 5 is: " + nextMultipleOfFive);
        scanner.close();
    }
}
