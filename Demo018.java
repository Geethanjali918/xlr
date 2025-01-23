import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        long minutes = scanner.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;
        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / minutesInDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        scanner.close();
    }
}
