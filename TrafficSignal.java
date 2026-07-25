//program to Display the action (Stop, Ready, Go) according to the traffic signal color 
import java.util.Scanner;
public class TrafficSignal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter colour of traffic signal: ");
        String c=sc.next().toLowerCase();
        switch(c)
        {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Colour");
        }
    }
    
}
