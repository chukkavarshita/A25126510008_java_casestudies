//program to analyze cricket scores
import java.util.Scanner;
public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the scores:");
        int i,j,t=0;
        for (i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
            t+=scores[i];
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(scores[i]<scores[j])
                {
                    int temp=scores[i];
                    scores[i]=scores[j];
                    scores[j]=temp;
                }
            }
        }
        
        System.out.println("Minimum Score: "+scores[n-1]);
        System.out.println("Maximum Score: "+scores[0]);
        System.out.println("Average score: "+(double)(t/n));
}
}
