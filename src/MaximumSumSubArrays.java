
import java.io.*;
import java.util.*;

class MaximumSumSubArrays
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {

            int N=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N);

            // Appending new elements at
            // the end of the list
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x);
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(k,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here

        int WindowSum=0;
        int maxSum = Integer.MIN_VALUE;
        int [] a = new int[Arr.size()];
        for (int i = 0; i < Arr.size(); i++) {
            a[i] = Arr.get(i);
        }

        for(int i=0;i<k;i++)
        {
            WindowSum+=a[i];    
        }

        maxSum=WindowSum;

        for(int i =k;i<N;i++)
        {
            WindowSum+=a[i]-a[i-k];
            maxSum=Math.max(maxSum,WindowSum);
        }
        return maxSum;
    }
}