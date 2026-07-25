//program to analyze expenses
import java.util.Scanner;
public class ExpenseAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        double[] expense = new double[n];

        double total = 0;
        double highest;

        System.out.println("Enter daily expenses:");

        for (int i = 0; i < n; i++) {
            expense[i] = sc.nextDouble();
            total += expense[i];
        }

        highest = expense[0];

        for (int i = 1; i < n; i++) {
            if (expense[i] > highest) {
                highest = expense[i];
            }
        }

        System.out.println("Total Expenditure = " + total);
        System.out.println("Highest Expense = " + highest);

        sc.close();
    }
}
