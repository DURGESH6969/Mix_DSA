/*  You are required to implement the following Function def LargeSmallSum(arr).
The function accepts an integers arr of size ’length’ as its arguments you are required to return
the sum of second-largest  element from the even positions and second smallest from the odd
 position of given ‘arr’.

Assumption:
All array elements are unique
Treat the 0th position as even
NOTE
Return 0 if array is empty
Return 0, if array length is 3 or less than 3

Example:-

Input
arr:3 2 1 7 5 4

Output
7

Explanation

Second largest among even position elements(1 3 5) is 3
Second largest among odd position element is 4
Thus output is 3+4 = 7
*/

import java.util.*;

public class Large_Small_Sum_Accenture {
    static int LargeSmallSum(int[] arr){
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(odd);
        Collections.sort(even);
        int e = even.size();
        if(arr.length<3) return 0;

        return even.get(e-2)+ odd.get(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter the elements into the array: ");
        for (int i = 0; i < length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(LargeSmallSum(arr));
    }
}
