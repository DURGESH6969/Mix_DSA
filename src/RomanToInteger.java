import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int ans =0;
        char[] str = s.toCharArray();
        int prev = 0;
        for(int i=str.length-1;i>=0;i--)
        {
            int current_val = mp.get(str[i]);
            if(prev > current_val)
                ans -=current_val;
            else
                ans = ans+current_val;

            prev = current_val;
        }
        System.out.println(ans);

    }
}
