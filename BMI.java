//program to calculate BMI
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if(bmi<20)
            System.out.println("UNDERWEIGHT");
        else if(bmi>=20 && bmi<25)
            System.out.println("NORMAL");
        else
            System.out.println("OVERWEIGHT");
    }
}
