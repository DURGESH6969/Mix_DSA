import java.util.Scanner;
import java.util.Stack;

public class Palindrome_using_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.next();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            st.push(ch);
        }
        String s2  = "";
        while(st.size()!=0)
        {
            char ch = st.pop();
            s2+=ch;
        }
        if(s2.equals(s)) System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
}
