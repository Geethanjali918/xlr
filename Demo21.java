import java.util.Scanner;
public class Demo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();
        System.out.print("Enter your monthly HRA: ");
        double monthlyHRA = scanner.nextDouble();
        System.out.print("Enter your monthly PF: ");
        double monthlyPF = scanner.nextDouble();
        double annualGrossSalary = monthlyGrossSalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;
        double deductions = annualHRA + annualPF;
        double taxableIncome = annualGrossSalary - deductions;
        double tax = 0;
        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20);
        } else {
            tax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30);
        }
        System.out.println("\nAnnual Gross Salary: Rs " + annualGrossSalary);
        System.out.println("Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Annual Income Tax: Rs " + tax);
        scanner.close();
    }
}
