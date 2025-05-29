import java.util.Scanner;

public class TaxCalculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your monthly salary (Reil): ");
        double grossSalary = scanner.nextDouble();

        double taxableSalary = grossSalary;

        double tax = calculateTax(taxableSalary);

        double netSalary = grossSalary - tax;

        System.out.println("Monthly Salary: " + taxableSalary + " Reil");
        System.out.println("Tax: " + tax + " Reil");
        System.out.println("Total Salary: " + netSalary + " Reil");

        scanner.close();
    }

    public static double calculateTax(double salary) {
        if (salary <= 800000) {
            return 0;
        } else if (salary <= 1250000) {
            return (salary - 800000) * 0.05;
        } else if (salary <= 8500000) {
            return (salary - 1250000) * 0.10 + 22500;
        } else if (salary <= 12500000) {
            return (salary - 8500000) * 0.15 + 697500;
        } else {
            return (salary - 12500000) * 0.20 + 1297500;
        }
    }
}
