import java.util.Scanner;
public class StudentIDCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter College Name: ");
        String college = sc.nextLine();
        System.out.println("\n==================================");
        System.out.println("         STUDENT ID CARD");
        System.out.println("==================================");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Branch    : " + branch);
        System.out.println("Year      : " + year);
        System.out.println("College   : " + college);
        System.out.println("==================================");

        sc.close();
    }
}
