//program to calculate shopping discount
import java.util.Scanner;
public class ShoppingDiscount {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price of the product: ");
        double price=sc.nextDouble();
        System.out.print("Enter discount percentage:");
        double disc=sc.nextDouble();
        double discAmt=(price*disc)/100;
        double gst;
        if(price<1000)
            gst=0.18*price;
        else if(price>=1000 && price<10000)
            gst=0.12*price;
        else
            gst=0.05*price;
      
        System.out.println("Total Price after discount is: "+(price-discAmt+gst));

        
    }
}
