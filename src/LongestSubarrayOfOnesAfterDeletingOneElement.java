/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array.
Return 0 if there is no such subarray.

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1]
longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.

*/


import java.util.Scanner;

public class LongestSubarrayOfOnesAfterDeletingOneElement {
    private static int longestSubarray(int[] nums) {

        int left = 0; // left pointer
        int right; // right pointer
        int allowedZeroes = 1, maxLength = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                allowedZeroes--;
            }

            while (allowedZeroes < 0) {
                if (nums[left] == 0) {
                    allowedZeroes++;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter elements in the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSubarray(arr));
    }
}
