//program to  check whether a withdrawal request is valid
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance,withdraw;
        System.out.print("enter account balance: ");
        balance=sc.nextDouble();
        System.out.print("enter amount to withdraw: ");
        withdraw=sc.nextDouble();
        double minBalance=1000;
        if(withdraw<=balance && (balance-withdraw)>=minBalance){
            System.out.println("Valid Withdrawl");
            System.out.println("Remaining Balance: " + (balance - withdraw));
        }
        else
        {
            System.out.println("Invalid Withdrawl");
            System.out.println("Balance: "+balance);
        }
    }
    
}
