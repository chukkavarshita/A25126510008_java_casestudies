//program to calculate employee salary
import java.util.Scanner;
public class EmployeeSalary {
    public static void main(String[] args){
        double basic,da,hra,pf,tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary:");
        basic=sc.nextDouble();
        da=(basic*0.5);
        hra=basic*0.1;
        pf=basic*0.12;
        tax=basic*0.1;
        double gross=basic+da+hra;
        double net=gross-pf-tax;
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);

    }
    
}
