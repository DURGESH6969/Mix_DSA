import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int num = n;
        int ans=0,i=0;
        System.out.print("using custom logic decimal is: ");
        while(n!=0)
        {
            int digit = n%10;
            if(digit==1) ans = ans + (int)Math.pow(2,i);
            i++;
            n=n/10;
        }
        System.out.print(ans);
        int decimal = Integer.parseInt(String.valueOf(num),2);
        System.out.print("\nusing inbuilt function decimal is: ");
        System.out.println(decimal);

    }
}
