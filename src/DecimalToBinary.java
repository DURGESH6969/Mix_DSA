import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Binary using inbuilt function: "+Integer.toBinaryString(n));
        int[] binary = new int[40];
        int index=0;
        while(n>0)
        {
            binary[index++]=n%2;
            n=n/2;
        }
        System.out.print("Binary using custom logic: ");
        for(int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }
    }
}
