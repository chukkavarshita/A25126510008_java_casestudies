//program to calculate water intake of a person
import java.util.Scanner;
public class WaterIntake {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] water=new double[7];
        int t=0,i;
        System.out.println("enter water intake for 7 days");
        for(i=0;i<7;i++){
            water[i]=sc.nextDouble();
        }
        for(i=0;i<7;i++){
        t+=water[i];
        System.out.println("Day "+(i+1)+" : "+water[i]+" litres");
        }
        System.out.println("Total water intake for 7 days : "+t+" litres");
        System.out.println("Average water intake for 7 days: "+(t/7)+" litres");
    }
}
