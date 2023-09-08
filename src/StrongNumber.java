import java.util.Scanner;

/*
*  A strong Number is a number whose digit's factorial sum is equal to the Number itself.
* Example - 145 = 1! + 4! + 5!
* */
public class StrongNumber {
    static int find_factorial(int num)
    {
        if(num==0)
            return 1;

        return num*find_factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int temp=n;
        int fact=0;
        int sum=0;
        while(temp!=0)
        {
            int r = temp%10;
            fact=find_factorial(r);
            temp=temp/10;
            sum+=fact;
        }
        if(sum==n) System.out.println(n+" is a Strong Number");
        else System.out.println(n+" is not a Strong Number");
    }
}
