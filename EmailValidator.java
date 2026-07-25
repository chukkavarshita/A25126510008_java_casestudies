//program to validate the Email
import java.util.Scanner;
public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        if (email.contains("@") &&
            (email.endsWith(".com") ||
             email.endsWith(".in") ||
             email.endsWith(".org") ||
             email.endsWith(".net"))) 
        {
            System.out.println("Valid Email Address");
        } 
        else 
        {
            System.out.println("Invalid Email Address");
        }
        sc.close();
    }
}
