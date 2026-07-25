import java.util.Scanner;
public class CustomerBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();
        System.out.print("Enter Item 1 Name: ");
        String item1 = sc.nextLine();
        System.out.print("Enter Item 1 Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Item 2 Name: ");
        String item2 = sc.nextLine();
        System.out.print("Enter Item 2 Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Item 3 Name: ");
        String item3 = sc.nextLine();
        System.out.print("Enter Item 3 Price: ");
        double price3 = sc.nextDouble();
        double total = price1 + price2 + price3;
        System.out.println("\n========================================");
        System.out.println("            CUSTOMER BILL");
        System.out.println("========================================");
        System.out.println("Customer Name : " + customer);
        System.out.println("----------------------------------------");
        System.out.println("Item\t\tPrice");
        System.out.println(item1 + "\t\t" + price1);
        System.out.println(item2 + "\t\t" + price2);
        System.out.println(item3 + "\t\t" + price3);
        System.out.println("----------------------------------------");
        System.out.println("Total Amount : " + total);
        System.out.println("========================================");
        sc.close();
    }
}
