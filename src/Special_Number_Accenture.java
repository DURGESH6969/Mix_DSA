/* given a function desiredArray that accepts an array `Arr` of size `N` and an Integer `K`
    you have to find the  `K` smallest integers that are not divisible by any of the `N` integers
    and return the sum of `K` integers.
 */
import java.util.Scanner;
public class Special_Number_Accenture {
    static int DesiredArray(int[] arr , int k)
    {
        int sum=0,number=1;
        while(k>0)
        {
            boolean isDivisible=false;
            for(int element:arr)
            {
                if (number%element==0) {
                    isDivisible=true;
                    break;
                }
            }
            if(!isDivisible){
                sum+=number;
                k--;
            }

            number++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements into the array: ");
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(DesiredArray(arr,k));


    }

}
