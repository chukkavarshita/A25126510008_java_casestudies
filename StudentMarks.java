//program to calculate marks and deccide the topper
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int total = 0;
        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        int topper = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > topper) {
                topper = marks[i];
            }
        }
        double average = (double) total / n;
        System.out.println("Topper Marks = " + topper);
        System.out.println("Class Average = " + average);
        sc.close();
    }
}
