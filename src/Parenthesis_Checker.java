import java.util.Stack;

public class Parenthesis_Checker {
    static boolean isValid(String arr) {
        Stack<Character> st = new Stack<>();
        for (char c : arr.toCharArray()) {
            if (c == '[' || c == '{' || c == '(')
                st.push(c);
            else{
                if(st.empty()) return false;

            char top = st.peek();
            if ((c == ']' && top=='[') || (c == '}' && top=='{')|| (c == ')' && top=='(') ) {
                st.pop();
            }
            else return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String s = "[{()}]";
        if(isValid(s))
            System.out.println("valid");
        else System.out.println("not valid");


    }
}
