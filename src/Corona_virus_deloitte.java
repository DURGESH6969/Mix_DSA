import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Corona_virus_deloitte {
    static int virus_propagation(int n,int spikes){
       return n>>spikes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter space separated values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of spikes: ");
        int spikes = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int temp = arr[i];
            ans.add(virus_propagation(temp,spikes));
        }
        System.out.println(ans);
    }
}
