import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        // TC = O(n) ,  SC = O(1) 👇👇

        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0) sum+=i;
        }
                if(sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");


        // TC = O(sqrt(n)) SC = O(1) 👇👇

        int sum2=0;
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(i==1) sum2+=i;
                else if(i==n/i) sum2+=i;
                else
                    sum2 = sum2 + i + (n/i);
            }
        }
        if(n==sum2) System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");


    }
}
