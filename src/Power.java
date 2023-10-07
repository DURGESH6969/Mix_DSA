import java.util.Scanner;

public class Power {
    static long power(int x , int n)
    {
        if(n!=0)
            return x * power(x,n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n to which x is raised to be ");
        int n = sc.nextInt();
        long ans = power(x,n);
        System.out.println(ans);
    }
}
