import java.util.Scanner;

public class MaximumConsecutiveOnes {
    private static int longestOnes(int[] nums, int k) {
        int zeroCount=0;
        int n = nums.length;
        int ans=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
                zeroCount++;
            while(zeroCount>k)
            {
                if(nums[j]==0)
                    zeroCount--;
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements into the array: ");
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(longestOnes(arr,k));

    }
}
