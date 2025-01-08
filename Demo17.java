import java.util.Scanner;

class SumOf2Digits {
    public int getSumOf2Digits(int n) {
        int fd = n / 10;
        int ld = n % 10;
        int sum = fd + ld;
        return sum;
    }
}

public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int n = scanner.nextInt();

        if (n >= 10 && n <= 99) { 
            SumOf2Digits obj = new SumOf2Digits();
            int sum = obj.getSumOf2Digits(n);
            System.out.println("The sum of the two digits is: " + sum);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }

        scanner.close();
    }
}
