 //student information and subject marks, calculates total, average, grade, pass/fail status
 //identifies the highest mark, and displays a formatted result report. 
 import java.util.Scanner;
class Student{
    String name;
    int ID,temp,max;
    int[] marks;
    void inputDetails()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        ID = scanner.nextInt();
        marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for(int i=0;i<5;i++)
{
    do{
        System.out.print("Subject "+(i+1)+": ");
        marks[i]=scanner.nextInt();

        if(marks[i]<0 || marks[i]>100)
            System.out.println("Invalid marks! Enter between 0 and 100.");
    }while(marks[i]<0 || marks[i]>100);
}
        max=marks[0];
        for(int i=0;i<marks.length;i++)
        {
                if(marks[i]>max)
                    max=marks[i];
        }
        System.out.println("Highest Mark:"+max);
    }
    void totalAvg()
    {
        int i,t=0;
        for(i=0;i<marks.length;i++)
        {
            t+=marks[i];
        }
        System.out.println("Total: " + t);
        System.out.println("Average: " + (double)t/marks.length);
    }
    void grade()
    {
        int i;
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]>=90)
                System.out.println("Subject: "+(i+1)+" Grade A");
            else if(marks[i]>=80&&marks[i]<90)
                System.out.println("Subject: "+(i+1)+" Grade B");
            else
                System.out.println("Subject: "+(i+1)+" Grade C");
        }
    }
    void passFail()
    {
        int i;
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]<40)
                System.out.println("Subject: "+(i+1)+" Fail");
            else
                System.out.println("Subject: "+(i+1)+" Pass");
        }
    }
    void display()
    {
        System.out.println("==========================");
        System.out.println("Student Name: "+name);
        System.out.println("Student ID: "+ID);
        System.out.println("Subject Marks: "+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]);
        System.out.println("Highest mark: "+max);
        System.out.println("Total: "+(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]));
        System.out.println("Average: "+(double)(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/marks.length);
        System.out.println("==========================");
    }

}
 public class SSRM{
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.totalAvg();
        s.grade();
        s.passFail();
        s.display();
    }
 }
