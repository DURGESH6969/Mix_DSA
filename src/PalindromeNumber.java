import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem = temp%10;
            temp=temp/10;
            rev = rev*10+rem;
        }
        if(rev==n) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
