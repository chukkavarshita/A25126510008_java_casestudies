//program to calculate mobile recharge
import java.util.Scanner;
public class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,gst,currentBalance,gstpercentage,total,rem;
        int validity;
        System.out.println("enter recharge amount");
        r=sc.nextDouble();
        System.out.println("enter gst percentage");
        gst=sc.nextDouble();
        System.out.println("enter validity in days");
        validity=sc.nextInt();
        System.out.print("Enter Current Balance: ");
        currentBalance = sc.nextDouble();
        gstpercentage=(r*gst)/100;
        total=r+gstpercentage;
        rem=currentBalance-total;
        System.out.println("total recharge amount: "+total);
        System.out.println("validity: "+validity);
        System.out.println("Remaining Balance: " + rem);
    }
}
