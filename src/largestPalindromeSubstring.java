// count the length of the largest palindromic sub-string from the given string input.

import java.util.Scanner;

public class largestPalindromeSubstring {
    static String find_largest_substring(String s){
        String result="";
        for(int i=0;i<s.length();i++)
        {
            String sub1 = expand(s,i,i);
            if(sub1.length()>result.length())
                result=sub1;
            String sub2 = expand(s,i,i+1);
            if(sub2.length()>result.length())
                result=sub2;
        }
        return result;
    }

    private static String expand(String str,int l,int r)
    {
        while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r))
        {
            r++;
            l--;
        }
        return str.substring(l+1,r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        int len = find_largest_substring(s).length();
        System.out.println("Largest Palindrome sub-string:  "+find_largest_substring(s));
        System.out.println("Length of the longest Palindrome sub-string is: "+len);

    }
}
