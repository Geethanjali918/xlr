import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter the fourth number: ");
        double num4 = scanner.nextDouble();
        double largest;

        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            largest = num2;
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            largest = num3;
        } else {
            largest = num4;
        }
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
