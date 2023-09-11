// count the length of the largest palindromic sub-string from the given string input.

import java.util.Scanner;

public class largestPalindromeSubstring {
    static void find_largest_substring(String str){
        int n =str.length();
        char[] s = str.toCharArray();
        int maxlength=1,start=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int flag=1;
                for(int k=0;k<(j-i+1)/2;k++)
                {
                    if(s[i+k]!=s[j-k]) flag=0;
                    if(flag==1 && (j-i+1)>maxlength){
                        start=i;
                        maxlength=j-i+1;
                    }
                }
            }
        }

        System.out.print("Max length: "+maxlength);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        find_largest_substring(s);

    }
}
