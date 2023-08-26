import java.util.Scanner;

public class possibleSubArrays {
    public static void main(String[] args) {
        int [] a = {15,2,7,45,16};

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers into the array");
//
//        for (int i = 0; i <a.length ; i++)
//            a[i]=sc.nextInt();

        System.out.println("<-------PRINTING ARRAYS------->\n");
        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println("\nprinting subarrays");
        for(int i=0;i<a.length;i++)
        {
            for (int j = i; j < a.length; j++) {

                for (int k = i; k <= j; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
            }
        }

    }
}
