//program to check whether the username exists or not
import java.util.Scanner;
public class UsernameChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = {"varshita", "rahul", "priya", "kiran", "admin"};
        System.out.print("Enter a new username: ");
        String newUser = sc.nextLine();
        boolean available = true;
        for (int i = 0; i < usernames.length; i++) 
        {
            if (newUser.equalsIgnoreCase(usernames[i])) 
            {
                available = false;
                break;
            }
        }
        if (available) 
        {
            System.out.println("Username is available.");
        } 
        else 
        {
            System.out.println("Username already exists.");
        }
        sc.close();
    }
}
